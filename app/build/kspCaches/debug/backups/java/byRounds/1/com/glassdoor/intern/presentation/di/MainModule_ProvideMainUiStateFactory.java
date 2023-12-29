package com.glassdoor.intern.presentation.di;

import com.glassdoor.intern.presentation.MainUiState;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class MainModule_ProvideMainUiStateFactory implements Factory<MainUiState> {
  @Override
  public MainUiState get() {
    return provideMainUiState();
  }

  public static MainModule_ProvideMainUiStateFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MainUiState provideMainUiState() {
    return Preconditions.checkNotNullFromProvides(MainModule.INSTANCE.provideMainUiState());
  }

  private static final class InstanceHolder {
    private static final MainModule_ProvideMainUiStateFactory INSTANCE = new MainModule_ProvideMainUiStateFactory();
  }
}
