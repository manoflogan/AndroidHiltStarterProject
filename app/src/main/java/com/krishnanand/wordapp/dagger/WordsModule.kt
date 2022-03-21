package com.krishnanand.wordapp.dagger

import com.krishnanand.wordapp.repository.WordRepository
import com.krishnanand.wordapp.repository.WordRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class WordsModule {

    @Binds
    abstract fun bindWeatherRepository(instance: WordRepositoryImpl): WordRepository
}