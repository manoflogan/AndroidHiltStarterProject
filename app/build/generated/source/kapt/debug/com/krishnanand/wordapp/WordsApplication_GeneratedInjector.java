package com.krishnanand.wordapp;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = WordsApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface WordsApplication_GeneratedInjector {
  void injectWordsApplication(WordsApplication wordsApplication);
}
