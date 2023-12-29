/*
 * Copyright (c) 2023, Glassdoor Inc.
 *
 * Licensed under the Glassdoor Inc Hiring Assessment License.
 * You may not use this file except in compliance with the License.
 * You must obtain explicit permission from Glassdoor Inc before sharing or distributing this file.
 * Mention Glassdoor Inc as the source if you use this code in any way.
 */

package com.glassdoor.intern.presentation.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.glassdoor.intern.presentation.IMainViewModel
import com.glassdoor.intern.presentation.MainIntent.HideErrorMessage
import com.glassdoor.intern.presentation.MainIntent.RefreshScreen
import com.glassdoor.intern.presentation.MainUiState
import com.glassdoor.intern.presentation.model.HeaderUiModel
import com.glassdoor.intern.presentation.model.ItemUiModel
import com.glassdoor.intern.presentation.theme.InternTheme
import com.glassdoor.intern.presentation.ui.component.ContentComponent
import com.glassdoor.intern.presentation.ui.component.ErrorMessageComponent
import com.glassdoor.intern.presentation.ui.component.TopBarComponent
import java.time.LocalDateTime

@Composable
internal fun MainScreen(
    viewModel: IMainViewModel,
    modifier: Modifier = Modifier,
) {
    /**
     * DONE: [Consume UI state safely from the ViewModel](https://developer.android.com/codelabs/jetpack-compose-advanced-state-side-effects#3)
     */
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()


    Scaffold(
        modifier = modifier,
        topBar = {
            TopBarComponent(
                modifier = Modifier.fillMaxWidth(),
                isLoading = uiState.isLoading,
                progressClickAction = { viewModel.acceptIntent(RefreshScreen) },
            )
        },
        snackbarHost = {
            ErrorMessageComponent(
                modifier = Modifier.fillMaxWidth(),
                errorMessage = uiState.errorMessage,
                hideErrorMessageAction = { viewModel.acceptIntent(HideErrorMessage) },
            )
        },
        content = { paddingValues ->
            ContentComponent(
                modifier = Modifier.padding(paddingValues),
                header = uiState.header,
                items = uiState.items,
            )
        },
    )
}
private val Lists = listOf(
    ItemUiModel(
        title = "Item Title 0",
        description = "Item Description 0",
        imageUrl = null,
        timestamp = "10:00",
    ),
    ItemUiModel(
        title = "Item Title 1",
        description = "Item Description 1",
        imageUrl = null,
        timestamp = "10:00",
    )
)
@Preview
@Composable
private fun MainScreenPreview() = InternTheme {
    //DONE("Define UI state for preview purposes")
    val uiState =MainUiState(
        errorMessage="error",
        header= HeaderUiModel(
            items= Lists,
            dates = LocalDateTime.now()
        ),
        isLoading = false,
        items = Lists
    )

    MainScreen(viewModel = uiState.asDummyViewModel)
}
