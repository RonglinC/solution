package com.glassdoor.intern.utils.presentation;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;

@ScopeMetadata
@QualifierMetadata("com.glassdoor.intern.utils.coroutine.Coroutines.Context.Default")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class UiStateMachineFactory_Factory implements Factory<UiStateMachineFactory> {
  private final Provider<CoroutineContext> coroutineContextProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public UiStateMachineFactory_Factory(Provider<CoroutineContext> coroutineContextProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.coroutineContextProvider = coroutineContextProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public UiStateMachineFactory get() {
    return newInstance(coroutineContextProvider.get(), savedStateHandleProvider.get());
  }

  public static UiStateMachineFactory_Factory create(
      Provider<CoroutineContext> coroutineContextProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new UiStateMachineFactory_Factory(coroutineContextProvider, savedStateHandleProvider);
  }

  public static UiStateMachineFactory newInstance(CoroutineContext coroutineContext,
      SavedStateHandle savedStateHandle) {
    return new UiStateMachineFactory(coroutineContext, savedStateHandle);
  }
}
