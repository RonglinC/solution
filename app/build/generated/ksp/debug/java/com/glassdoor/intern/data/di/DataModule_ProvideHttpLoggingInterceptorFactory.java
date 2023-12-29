package com.glassdoor.intern.data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.logging.HttpLoggingInterceptor;

@ScopeMetadata
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
public final class DataModule_ProvideHttpLoggingInterceptorFactory implements Factory<HttpLoggingInterceptor> {
  @Override
  public HttpLoggingInterceptor get() {
    return provideHttpLoggingInterceptor();
  }

  public static DataModule_ProvideHttpLoggingInterceptorFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HttpLoggingInterceptor provideHttpLoggingInterceptor() {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideHttpLoggingInterceptor());
  }

  private static final class InstanceHolder {
    private static final DataModule_ProvideHttpLoggingInterceptorFactory INSTANCE = new DataModule_ProvideHttpLoggingInterceptorFactory();
  }
}
