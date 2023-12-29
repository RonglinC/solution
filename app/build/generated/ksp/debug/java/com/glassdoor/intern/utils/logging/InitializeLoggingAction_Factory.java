package com.glassdoor.intern.utils.logging;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import timber.log.Timber;

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
public final class InitializeLoggingAction_Factory implements Factory<InitializeLoggingAction> {
  private final Provider<Set<Timber.Tree>> timberTreesProvider;

  public InitializeLoggingAction_Factory(Provider<Set<Timber.Tree>> timberTreesProvider) {
    this.timberTreesProvider = timberTreesProvider;
  }

  @Override
  public InitializeLoggingAction get() {
    return newInstance(timberTreesProvider.get());
  }

  public static InitializeLoggingAction_Factory create(
      Provider<Set<Timber.Tree>> timberTreesProvider) {
    return new InitializeLoggingAction_Factory(timberTreesProvider);
  }

  public static InitializeLoggingAction newInstance(Set<Timber.Tree> timberTrees) {
    return new InitializeLoggingAction(timberTrees);
  }
}
