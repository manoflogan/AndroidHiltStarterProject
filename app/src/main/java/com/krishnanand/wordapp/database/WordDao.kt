package com.krishnanand.wordapp.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.krishnanand.wordapp.model.Word
import kotlinx.coroutines.flow.Flow

@Dao
interface WordDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertWord(instance: Word): Long

    @Query("SELECT * FROM words")
    fun getAllWords(): Flow<List<Word>>
}