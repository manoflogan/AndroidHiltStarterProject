package com.krishnanand.wordapp.database

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    fun provideRoomDatabase(@ApplicationContext context: Context): WordsDatabase  {
        return Room.databaseBuilder(context, WordsDatabase::class.java, "words.db").build()
    }

    @Provides
    fun provideWordDao(wordsDatabase: WordsDatabase): WordDao = wordsDatabase.wordDao()
}