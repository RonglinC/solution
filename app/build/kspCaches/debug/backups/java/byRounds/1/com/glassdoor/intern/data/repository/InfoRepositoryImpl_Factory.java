package com.glassdoor.intern.data.repository;

import com.glassdoor.intern.data.mapper.HeaderInfoMapper;
import com.glassdoor.intern.data.source.InfoApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class InfoRepositoryImpl_Factory implements Factory<InfoRepositoryImpl> {
  private final Provider<InfoApi> infoApiProvider;

  private final Provider<HeaderInfoMapper> headerInfoMapperProvider;

  public InfoRepositoryImpl_Factory(Provider<InfoApi> infoApiProvider,
      Provider<HeaderInfoMapper> headerInfoMapperProvider) {
    this.infoApiProvider = infoApiProvider;
    this.headerInfoMapperProvider = headerInfoMapperProvider;
  }

  @Override
  public InfoRepositoryImpl get() {
    return newInstance(infoApiProvider.get(), headerInfoMapperProvider.get());
  }

  public static InfoRepositoryImpl_Factory create(Provider<InfoApi> infoApiProvider,
      Provider<HeaderInfoMapper> headerInfoMapperProvider) {
    return new InfoRepositoryImpl_Factory(infoApiProvider, headerInfoMapperProvider);
  }

  public static InfoRepositoryImpl newInstance(InfoApi infoApi, HeaderInfoMapper headerInfoMapper) {
    return new InfoRepositoryImpl(infoApi, headerInfoMapper);
  }
}
