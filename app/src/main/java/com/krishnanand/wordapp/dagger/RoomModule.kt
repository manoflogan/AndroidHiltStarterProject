package com.krishnanand.wordapp.dagger

import android.content.Context
import androidx.room.Room
import com.krishnanand.wordapp.database.WordsDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    fun provideRoomDatabase(@ApplicationContext context: Context): WordsDatabase {
        return Room.databaseBuilder(context, WordsDatabase::class.java, "words.db").build()
    }
}