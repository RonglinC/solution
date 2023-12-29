package com.glassdoor.intern.data.di;

import com.glassdoor.intern.data.source.InfoApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class DataModule_ProvideInfoApiFactory implements Factory<InfoApi> {
  private final Provider<Retrofit> retrofitProvider;

  public DataModule_ProvideInfoApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public InfoApi get() {
    return provideInfoApi(retrofitProvider.get());
  }

  public static DataModule_ProvideInfoApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new DataModule_ProvideInfoApiFactory(retrofitProvider);
  }

  public static InfoApi provideInfoApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideInfoApi(retrofit));
  }
}
