package com.glassdoor.intern.data.network;

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
public final class TokenInterceptor_Factory implements Factory<TokenInterceptor> {
  @Override
  public TokenInterceptor get() {
    return newInstance();
  }

  public static TokenInterceptor_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static TokenInterceptor newInstance() {
    return new TokenInterceptor();
  }

  private static final class InstanceHolder {
    private static final TokenInterceptor_Factory INSTANCE = new TokenInterceptor_Factory();
  }
}
