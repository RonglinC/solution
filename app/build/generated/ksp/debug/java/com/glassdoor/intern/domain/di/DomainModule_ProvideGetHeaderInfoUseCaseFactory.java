package com.glassdoor.intern.domain.di;

import com.glassdoor.intern.domain.repository.InfoRepository;
import com.glassdoor.intern.domain.usecase.GetHeaderInfoUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.ViewModelScoped")
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
public final class DomainModule_ProvideGetHeaderInfoUseCaseFactory implements Factory<GetHeaderInfoUseCase> {
  private final Provider<InfoRepository> infoRepositoryProvider;

  public DomainModule_ProvideGetHeaderInfoUseCaseFactory(
      Provider<InfoRepository> infoRepositoryProvider) {
    this.infoRepositoryProvider = infoRepositoryProvider;
  }

  @Override
  public GetHeaderInfoUseCase get() {
    return provideGetHeaderInfoUseCase(infoRepositoryProvider.get());
  }

  public static DomainModule_ProvideGetHeaderInfoUseCaseFactory create(
      Provider<InfoRepository> infoRepositoryProvider) {
    return new DomainModule_ProvideGetHeaderInfoUseCaseFactory(infoRepositoryProvider);
  }

  public static GetHeaderInfoUseCase provideGetHeaderInfoUseCase(InfoRepository infoRepository) {
    return Preconditions.checkNotNullFromProvides(DomainModule.INSTANCE.provideGetHeaderInfoUseCase(infoRepository));
  }
}
