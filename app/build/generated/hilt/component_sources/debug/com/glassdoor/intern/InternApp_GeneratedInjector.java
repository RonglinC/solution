package com.glassdoor.intern;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = InternApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface InternApp_GeneratedInjector {
  void injectInternApp(InternApp internApp);
}
