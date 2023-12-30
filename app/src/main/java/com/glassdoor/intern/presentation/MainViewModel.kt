 /*
 * Copyright (c) 2023, Glassdoor Inc.
 *
 * Licensed under the Glassdoor Inc Hiring Assessment License.
 * You may not use this file except in compliance with the License.
 * You must obtain explicit permission from Glassdoor Inc before sharing or distributing this file.
 * Mention Glassdoor Inc as the source if you use this code in any way.
 */

package com.glassdoor.intern.presentation

import androidx.lifecycle.ViewModel
import com.github.michaelbull.result.onFailure
import com.github.michaelbull.result.onSuccess
import com.glassdoor.intern.data.mapper.HeaderInfoMapper
import com.glassdoor.intern.domain.usecase.GetHeaderInfoUseCase
import com.glassdoor.intern.presentation.MainIntent.HideErrorMessage
import com.glassdoor.intern.presentation.MainIntent.RefreshScreen
import com.glassdoor.intern.presentation.MainUiState.PartialState
import com.glassdoor.intern.presentation.MainUiState.PartialState.HideLoadingState
import com.glassdoor.intern.presentation.MainUiState.PartialState.ShowLoadingState
import com.glassdoor.intern.presentation.MainUiState.PartialState.UpdateErrorMessageState
import com.glassdoor.intern.presentation.MainUiState.PartialState.UpdateHeaderState
import com.glassdoor.intern.presentation.MainUiState.PartialState.UpdateItemsState
import com.glassdoor.intern.presentation.mapper.ItemUiModelMapper
import com.glassdoor.intern.presentation.model.HeaderUiModel
import com.glassdoor.intern.utils.presentation.UiStateMachine
import com.glassdoor.intern.utils.presentation.UiStateMachineFactory
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import timber.log.Timber
import javax.inject.Inject

internal interface IMainViewModel : UiStateMachine<MainUiState, PartialState, MainIntent>

/**
 * DONE: Inject the correct header mapper dependency
 */
@HiltViewModel
internal class MainViewModel @Inject constructor(
    defaultUiState: MainUiState,
    uiStateMachineFactory: UiStateMachineFactory,
    private val getHeaderInfoUseCase: GetHeaderInfoUseCase,
    private val itemUiModelMapper: ItemUiModelMapper,
    private val headerInfoMapper: HeaderInfoMapper
) : ViewModel(), IMainViewModel {

    /**
     * DONE: Define the correct methods as callbacks
     */
    private val uiStateMachine: UiStateMachine<MainUiState, PartialState, MainIntent> =
        uiStateMachineFactory.create(
            defaultUiState = defaultUiState,
            errorTransform = {throwable->flow{
                emit(UpdateItemsState(emptyList()))
                emit(UpdateErrorMessageState(throwable.message))
            }},
            intentTransform = {intent->
                              when(intent){
                                  is MainIntent.HideErrorMessage->flowOf(UpdateErrorMessageState(errorMessage = null))
                                  is MainIntent.RefreshScreen->flowOf(ShowLoadingState)
                              }
            },
            updateUiState = { currentState,partialState->
                            when(partialState){
                                is ShowLoadingState->currentState.copy(isLoading =true)
                                is HideLoadingState -> currentState.copy(isLoading = false)
                                is UpdateErrorMessageState -> currentState.copy(errorMessage = partialState.errorMessage)
                                is UpdateHeaderState -> currentState.copy(header = partialState.header)
                                is UpdateItemsState -> currentState.copy(items = partialState.items)
                            }
            },
        )


    override val uiState: StateFlow<MainUiState> = uiStateMachine.uiState
    /**
     * DONE: Refresh the screen only when the header is empty
     */
    init {
        if(uiState.value.header.isEmpty){
            onRefreshScreen()
        }

    }

    /**
     * Done: Delegate method to [uiStateMachine]
     */
    override fun acceptIntent(intent: MainIntent) {
        uiStateMachine.acceptIntent(intent)
    }

    private fun errorTransform(throwable: Throwable): Flow<PartialState> = flow {
        Timber.e(throwable, "MainViewModel")

        emit(HideLoadingState)

        emit(UpdateItemsState(emptyList()))

        emit(UpdateErrorMessageState(errorMessage = throwable.message))
    }

    private fun intentTransform(intent: MainIntent): Flow<PartialState> = when (intent) {
        HideErrorMessage -> onHideErrorMessage()
        RefreshScreen -> onRefreshScreen()
    }

    private fun updateUiState(
        previousUiState: MainUiState,
        partialState: PartialState,
    ): MainUiState = when (partialState) {
         HideLoadingState, ShowLoadingState -> {
            /**
             * Done: Separate handling and update correct properties [previousUiState]
             */
             when(partialState){
                 is HideLoadingState->previousUiState.copy(isLoading = false)
                 is ShowLoadingState->previousUiState.copy(isLoading =true)
                 else ->previousUiState
             }
        }

        is UpdateErrorMessageState -> with(partialState) {
            previousUiState.copy(
                errorMessage = errorMessage,
                items = if (errorMessage.isNullOrEmpty()) previousUiState.items else emptyList(),
            )
        }

        is UpdateHeaderState -> {
            previousUiState.copy(header = partialState.header)
        }

        is UpdateItemsState -> {
            previousUiState.copy(items = partialState.items)
        }
    }

    private fun onHideErrorMessage(): Flow<PartialState> =
        flowOf(UpdateErrorMessageState(errorMessage = null))

    private fun onRefreshScreen(): Flow<PartialState> = flow {
        emit(ShowLoadingState)

        getHeaderInfoUseCase()
            .onSuccess { headerInfo ->
                /**
                 * DONE: Transform the header domain model to the UI model
                 * Done: Emit the transformed UI model as state
                 */
                val headerUiModel = HeaderUiModel(
                    items = headerInfo.items.map(itemUiModelMapper::toUiModel),
                    dates = headerInfo.dates
                )
                emit(UpdateHeaderState(headerUiModel))

                emit(UpdateItemsState(headerInfo.items.map(itemUiModelMapper::toUiModel)))
            }
            .onFailure { throwable ->
                emit(UpdateErrorMessageState(errorMessage = throwable.message))
            }

        emit(HideLoadingState)
    }
}
