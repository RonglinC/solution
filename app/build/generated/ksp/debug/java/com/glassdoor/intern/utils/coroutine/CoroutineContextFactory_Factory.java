package com.glassdoor.intern.utils.coroutine;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineExceptionHandler;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("com.glassdoor.intern.utils.coroutine.CoroutineExceptionHandle")
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
public final class CoroutineContextFactory_Factory implements Factory<CoroutineContextFactory> {
  private final Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider;

  public CoroutineContextFactory_Factory(
      Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider) {
    this.coroutineExceptionHandlerProvider = coroutineExceptionHandlerProvider;
  }

  @Override
  public CoroutineContextFactory get() {
    return newInstance(coroutineExceptionHandlerProvider.get());
  }

  public static CoroutineContextFactory_Factory create(
      Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider) {
    return new CoroutineContextFactory_Factory(coroutineExceptionHandlerProvider);
  }

  public static CoroutineContextFactory newInstance(
      CoroutineExceptionHandler coroutineExceptionHandler) {
    return new CoroutineContextFactory(coroutineExceptionHandler);
  }
}
