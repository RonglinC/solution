package com.glassdoor.intern.presentation;

import com.glassdoor.intern.domain.usecase.GetHeaderInfoUseCase;
import com.glassdoor.intern.presentation.mapper.ItemUiModelMapper;
import com.glassdoor.intern.utils.presentation.UiStateMachineFactory;
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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<MainUiState> defaultUiStateProvider;

  private final Provider<UiStateMachineFactory> uiStateMachineFactoryProvider;

  private final Provider<GetHeaderInfoUseCase> getHeaderInfoUseCaseProvider;

  private final Provider<ItemUiModelMapper> itemUiModelMapperProvider;

  public MainViewModel_Factory(Provider<MainUiState> defaultUiStateProvider,
      Provider<UiStateMachineFactory> uiStateMachineFactoryProvider,
      Provider<GetHeaderInfoUseCase> getHeaderInfoUseCaseProvider,
      Provider<ItemUiModelMapper> itemUiModelMapperProvider) {
    this.defaultUiStateProvider = defaultUiStateProvider;
    this.uiStateMachineFactoryProvider = uiStateMachineFactoryProvider;
    this.getHeaderInfoUseCaseProvider = getHeaderInfoUseCaseProvider;
    this.itemUiModelMapperProvider = itemUiModelMapperProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(defaultUiStateProvider.get(), uiStateMachineFactoryProvider.get(), getHeaderInfoUseCaseProvider.get(), itemUiModelMapperProvider.get());
  }

  public static MainViewModel_Factory create(Provider<MainUiState> defaultUiStateProvider,
      Provider<UiStateMachineFactory> uiStateMachineFactoryProvider,
      Provider<GetHeaderInfoUseCase> getHeaderInfoUseCaseProvider,
      Provider<ItemUiModelMapper> itemUiModelMapperProvider) {
    return new MainViewModel_Factory(defaultUiStateProvider, uiStateMachineFactoryProvider, getHeaderInfoUseCaseProvider, itemUiModelMapperProvider);
  }

  public static MainViewModel newInstance(MainUiState defaultUiState,
      UiStateMachineFactory uiStateMachineFactory, GetHeaderInfoUseCase getHeaderInfoUseCase,
      ItemUiModelMapper itemUiModelMapper) {
    return new MainViewModel(defaultUiState, uiStateMachineFactory, getHeaderInfoUseCase, itemUiModelMapper);
  }
}
