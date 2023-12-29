/*
 * Copyright (c) 2023, Glassdoor Inc.
 *
 * Licensed under the Glassdoor Inc Hiring Assessment License.
 * You may not use this file except in compliance with the License.
 * You must obtain explicit permission from Glassdoor Inc before sharing or distributing this file.
 * Mention Glassdoor Inc as the source if you use this code in any way.
 */

package com.glassdoor.intern.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.glassdoor.intern.presentation.MainViewModel
import com.glassdoor.intern.presentation.theme.InternTheme
import dagger.hilt.android.AndroidEntryPoint

/**
 * Done: [Annotate a class for dependency injection](https://developer.android.com/training/dependency-injection/hilt-android#android-classes)
 */
@AndroidEntryPoint
internal class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            InternTheme {
                /**
                 * DONE: Define the main composable to display
                 */
                MainScreen(viewModel = viewModel)
            }
        }
    }
}
