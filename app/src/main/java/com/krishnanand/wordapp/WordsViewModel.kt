package com.krishnanand.wordapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.krishnanand.wordapp.model.Word
import com.krishnanand.wordapp.repository.WordRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WordsViewModel @Inject constructor(
    private val wordRepository: WordRepository
): ViewModel() {

    private val _wordsListFlow: MutableStateFlow<List<Word>> = MutableStateFlow(mutableListOf())
    val wordListFlow: StateFlow<List<Word>>
        get() = _wordsListFlow
    private val _insertUpdate = MutableStateFlow<Long>(0)
    val insertUpdate: StateFlow<Long>
        get() = _insertUpdate

    fun saveWord(word: String) {
        viewModelScope.launch {
            val rowsUpdated = wordRepository.insertWord(Word(0, word))
            _insertUpdate.value = rowsUpdated
        }
    }

    fun getAllWords() {
        viewModelScope.launch {
            wordRepository.getAllWords().collect {
                _wordsListFlow.value = it
            }
        }
    }


}