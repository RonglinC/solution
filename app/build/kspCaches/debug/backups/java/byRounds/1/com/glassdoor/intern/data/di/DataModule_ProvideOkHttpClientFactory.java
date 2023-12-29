package com.glassdoor.intern.data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
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
public final class DataModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<HttpLoggingInterceptor> interceptorProvider;

  private final Provider<Set<Interceptor>> interceptorsProvider;

  public DataModule_ProvideOkHttpClientFactory(Provider<HttpLoggingInterceptor> interceptorProvider,
      Provider<Set<Interceptor>> interceptorsProvider) {
    this.interceptorProvider = interceptorProvider;
    this.interceptorsProvider = interceptorsProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(interceptorProvider.get(), interceptorsProvider.get());
  }

  public static DataModule_ProvideOkHttpClientFactory create(
      Provider<HttpLoggingInterceptor> interceptorProvider,
      Provider<Set<Interceptor>> interceptorsProvider) {
    return new DataModule_ProvideOkHttpClientFactory(interceptorProvider, interceptorsProvider);
  }

  public static OkHttpClient provideOkHttpClient(HttpLoggingInterceptor interceptor,
      Set<Interceptor> interceptors) {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideOkHttpClient(interceptor, interceptors));
  }
}
