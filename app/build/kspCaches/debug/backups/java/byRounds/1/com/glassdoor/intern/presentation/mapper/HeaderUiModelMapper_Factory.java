package com.glassdoor.intern.presentation.mapper;

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
public final class HeaderUiModelMapper_Factory implements Factory<HeaderUiModelMapper> {
  @Override
  public HeaderUiModelMapper get() {
    return newInstance();
  }

  public static HeaderUiModelMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HeaderUiModelMapper newInstance() {
    return new HeaderUiModelMapper();
  }

  private static final class InstanceHolder {
    private static final HeaderUiModelMapper_Factory INSTANCE = new HeaderUiModelMapper_Factory();
  }
}
