/*
 * Copyright (c) 2023, Glassdoor Inc.
 *
 * Licensed under the Glassdoor Inc Hiring Assessment License.
 * You may not use this file except in compliance with the License.
 * You must obtain explicit permission from Glassdoor Inc before sharing or distributing this file.
 * Mention Glassdoor Inc as the source if you use this code in any way.
 */

package com.glassdoor.intern.utils.coroutine

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import timber.log.Timber
import javax.inject.Qualifier
import javax.inject.Singleton
import kotlin.coroutines.CoroutineContext

/**
 * Done: [Annotate the DI module](https://developer.android.com/training/dependency-injection/hilt-android#hilt-modules) with correct definitions and [component](https://developer.android.com/training/dependency-injection/hilt-android#hilt-modules)
 */
/**
 * DONE: Annotate dependency with the correct [qualifier label](https://developer.android.com/training/dependency-injection/hilt-android#multiple-bindings)
 */

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class CoroutineExceptionHandle

@Qualifier
@Retention (AnnotationRetention.BINARY)
annotation class CoroutineContextDefault

@Module
@InstallIn(SingletonComponent::class)
internal object CoroutineModule {

    @Singleton
    @Provides
    @CoroutineExceptionHandle
    fun provideCoroutineExceptionHandler(): CoroutineExceptionHandler =
        CoroutineExceptionHandler { _, throwable ->
            Timber.e(throwable, "CoroutineExceptionHandler")
        }


    @Singleton
    @Provides
    @Coroutines.Context.Default
    fun provideCoroutineContextDefault(
        coroutineContextFactory: CoroutineContextFactory
    ): CoroutineContext =
        coroutineContextFactory.create(Dispatchers.Default)
}
