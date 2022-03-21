package com.krishnanand.wordapp;

import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = WordActivity.class
)
@GeneratedEntryPoint
@InstallIn(ActivityComponent.class)
public interface WordActivity_GeneratedInjector {
  void injectWordActivity(WordActivity wordActivity);
}
