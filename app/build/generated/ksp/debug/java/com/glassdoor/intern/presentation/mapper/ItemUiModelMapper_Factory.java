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
public final class ItemUiModelMapper_Factory implements Factory<ItemUiModelMapper> {
  @Override
  public ItemUiModelMapper get() {
    return newInstance();
  }

  public static ItemUiModelMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ItemUiModelMapper newInstance() {
    return new ItemUiModelMapper();
  }

  private static final class InstanceHolder {
    private static final ItemUiModelMapper_Factory INSTANCE = new ItemUiModelMapper_Factory();
  }
}
