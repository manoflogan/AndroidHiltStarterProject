package com.krishnanand.wordapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.krishnanand.wordapp.model.Word

@Database(entities = [Word::class], version = 1, exportSchema = false)
abstract class WordsDatabase: RoomDatabase() {
    abstract fun wordDao(): WordDao
}