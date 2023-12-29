package com.glassdoor.intern.utils.logging;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
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
public final class LoggingModule_ProvideTimberTreeFactory implements Factory<Timber.Tree> {
  @Override
  public Timber.Tree get() {
    return provideTimberTree();
  }

  public static LoggingModule_ProvideTimberTreeFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Timber.Tree provideTimberTree() {
    return Preconditions.checkNotNullFromProvides(LoggingModule.INSTANCE.provideTimberTree());
  }

  private static final class InstanceHolder {
    private static final LoggingModule_ProvideTimberTreeFactory INSTANCE = new LoggingModule_ProvideTimberTreeFactory();
  }
}
