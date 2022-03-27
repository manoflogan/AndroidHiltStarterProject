package com.krishnanand.wordapp.repository

import com.krishnanand.wordapp.database.WordDao
import com.krishnanand.wordapp.model.Word
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext
import javax.inject.Inject

class WordRepositoryImpl @Inject constructor(
    private val wordDao: WordDao,
    private val coroutineDispatchers: CoroutineDispatchers
): WordRepository {
    override suspend fun insertWord(word: Word): Long = withContext(coroutineDispatchers.io) {
        wordDao.insertWord(word)
    }

    override suspend fun getAllWords(): Flow<List<Word>> {
        return wordDao.getAllWords().flowOn(coroutineDispatchers.io)
    }
}