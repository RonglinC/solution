/*
 * Copyright (c) 2023, Glassdoor Inc.
 *
 * Licensed under the Glassdoor Inc Hiring Assessment License.
 * You may not use this file except in compliance with the License.
 * You must obtain explicit permission from Glassdoor Inc before sharing or distributing this file.
 * Mention Glassdoor Inc as the source if you use this code in any way.
 */

package com.glassdoor.intern.presentation.di

import com.glassdoor.intern.presentation.MainUiState
import com.glassdoor.intern.presentation.model.HeaderUiModel
import com.glassdoor.intern.presentation.model.ItemUiModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import java.time.LocalDateTime

@Module
@InstallIn(ViewModelComponent::class)
internal object MainModule {

    @Provides
    fun provideMainUiState(): MainUiState =
        // DONE("Define default values and provide initial state")
       MainUiState(
           errorMessage = null,
           header= HeaderUiModel(
               task="",
                items =  emptyList(),
               dates = LocalDateTime.now()
           ),
           isLoading = false,
           items=listOf(
               ItemUiModel(
                   title = "Item Title 0",
                   description = "Item Description 0",
                   imageUrl = null,
                   timestamp = "10:00",
               )
           )

       )

}
