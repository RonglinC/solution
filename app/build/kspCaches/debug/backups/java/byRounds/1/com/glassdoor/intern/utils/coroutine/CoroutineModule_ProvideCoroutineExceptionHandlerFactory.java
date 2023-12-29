package com.glassdoor.intern.utils.coroutine;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
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
public final class CoroutineModule_ProvideCoroutineExceptionHandlerFactory implements Factory<CoroutineExceptionHandler> {
  @Override
  public CoroutineExceptionHandler get() {
    return provideCoroutineExceptionHandler();
  }

  public static CoroutineModule_ProvideCoroutineExceptionHandlerFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineExceptionHandler provideCoroutineExceptionHandler() {
    return Preconditions.checkNotNullFromProvides(CoroutineModule.INSTANCE.provideCoroutineExceptionHandler());
  }

  private static final class InstanceHolder {
    private static final CoroutineModule_ProvideCoroutineExceptionHandlerFactory INSTANCE = new CoroutineModule_ProvideCoroutineExceptionHandlerFactory();
  }
}
