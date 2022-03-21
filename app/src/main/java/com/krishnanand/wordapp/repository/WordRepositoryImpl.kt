package com.krishnanand.wordapp.repository

import com.krishnanand.wordapp.database.WordDao
import com.krishnanand.wordapp.model.Word
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WordRepositoryImpl @Inject constructor(
    private val wordDao: WordDao
): WordRepository {
    override suspend fun insertWord(word: Word): Long {
        return wordDao.insertWord(word)
    }

    override suspend fun getAllWords(): Flow<List<Word>> =
        wordDao.getAllWords()
}