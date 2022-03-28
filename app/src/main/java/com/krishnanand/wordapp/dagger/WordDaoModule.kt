package com.krishnanand.wordapp.dagger

import com.krishnanand.wordapp.database.WordDao
import com.krishnanand.wordapp.database.WordsDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object WordDaoModule {

    @Provides
    fun provideWordDao(wordsDatabase: WordsDatabase): WordDao = wordsDatabase.wordDao()
}