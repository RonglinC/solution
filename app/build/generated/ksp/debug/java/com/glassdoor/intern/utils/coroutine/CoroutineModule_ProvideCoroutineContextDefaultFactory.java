package com.glassdoor.intern.utils.coroutine;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
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
public final class CoroutineModule_ProvideCoroutineContextDefaultFactory implements Factory<CoroutineContext> {
  private final Provider<CoroutineContextFactory> coroutineContextFactoryProvider;

  public CoroutineModule_ProvideCoroutineContextDefaultFactory(
      Provider<CoroutineContextFactory> coroutineContextFactoryProvider) {
    this.coroutineContextFactoryProvider = coroutineContextFactoryProvider;
  }

  @Override
  public CoroutineContext get() {
    return provideCoroutineContextDefault(coroutineContextFactoryProvider.get());
  }

  public static CoroutineModule_ProvideCoroutineContextDefaultFactory create(
      Provider<CoroutineContextFactory> coroutineContextFactoryProvider) {
    return new CoroutineModule_ProvideCoroutineContextDefaultFactory(coroutineContextFactoryProvider);
  }

  public static CoroutineContext provideCoroutineContextDefault(
      CoroutineContextFactory coroutineContextFactory) {
    return Preconditions.checkNotNullFromProvides(CoroutineModule.INSTANCE.provideCoroutineContextDefault(coroutineContextFactory));
  }
}
