package com.glassdoor.intern.data.mapper;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class HeaderInfoMapper_Factory implements Factory<HeaderInfoMapper> {
  @Override
  public HeaderInfoMapper get() {
    return newInstance();
  }

  public static HeaderInfoMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HeaderInfoMapper newInstance() {
    return new HeaderInfoMapper();
  }

  private static final class InstanceHolder {
    private static final HeaderInfoMapper_Factory INSTANCE = new HeaderInfoMapper_Factory();
  }
}
