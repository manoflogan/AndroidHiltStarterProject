package com.krishnanand.wordapp.dagger

import com.krishnanand.wordapp.repository.CoroutineDispatchers
import com.krishnanand.wordapp.repository.CoroutineDispatchersImpl
import com.krishnanand.wordapp.repository.WordRepository
import com.krishnanand.wordapp.repository.WordRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class WordRepositoryModule {

    @Binds
    abstract fun bindWordRepository(instance: WordRepositoryImpl): WordRepository

    @Binds
    abstract fun bindCoroutineDispatchers(instance: CoroutineDispatchersImpl): CoroutineDispatchers
}