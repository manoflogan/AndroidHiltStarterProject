package com.krishnanand.wordapp

import androidx.lifecycle.ViewModel
import com.krishnanand.wordapp.model.Word
import com.krishnanand.wordapp.repository.WordRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class WordsViewModel constructor(
    private val wordRepository: WordRepository
): ViewModel() {

    private val _wordsListFlow: MutableStateFlow<List<Word>> = MutableStateFlow(mutableListOf())
    private val wordListFlow: StateFlow<List<Word>>
        get() = _wordsListFlow


}