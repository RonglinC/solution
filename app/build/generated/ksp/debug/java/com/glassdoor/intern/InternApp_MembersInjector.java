package com.glassdoor.intern;

import com.glassdoor.intern.utils.logging.InitializeLoggingAction;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class InternApp_MembersInjector implements MembersInjector<InternApp> {
  private final Provider<InitializeLoggingAction> initializeLoggingActionProvider;

  public InternApp_MembersInjector(
      Provider<InitializeLoggingAction> initializeLoggingActionProvider) {
    this.initializeLoggingActionProvider = initializeLoggingActionProvider;
  }

  public static MembersInjector<InternApp> create(
      Provider<InitializeLoggingAction> initializeLoggingActionProvider) {
    return new InternApp_MembersInjector(initializeLoggingActionProvider);
  }

  @Override
  public void injectMembers(InternApp instance) {
    injectInitializeLogging(instance, initializeLoggingActionProvider.get());
  }

  public static void injectInitializeLogging(InternApp instance,
      InitializeLoggingAction initializeLoggingAction) {
    instance.initializeLogging(initializeLoggingAction);
  }
}
