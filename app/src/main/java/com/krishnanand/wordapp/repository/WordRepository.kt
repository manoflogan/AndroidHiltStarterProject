package com.krishnanand.wordapp.repository

import com.krishnanand.wordapp.model.Word
import kotlinx.coroutines.flow.Flow

interface WordRepository {

    suspend fun insertWord(word: Word) : Long

    suspend fun getAllWords(): Flow<List<Word>>
}