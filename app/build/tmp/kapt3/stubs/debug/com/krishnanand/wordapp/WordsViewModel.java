package com.krishnanand.wordapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/krishnanand/wordapp/WordsViewModel;", "Landroidx/lifecycle/ViewModel;", "wordRepository", "Lcom/krishnanand/wordapp/repository/WordRepository;", "(Lcom/krishnanand/wordapp/repository/WordRepository;)V", "_wordsListFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/krishnanand/wordapp/model/Word;", "wordListFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getWordListFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "app_debug"})
public final class WordsViewModel extends androidx.lifecycle.ViewModel {
    private final com.krishnanand.wordapp.repository.WordRepository wordRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.krishnanand.wordapp.model.Word>> _wordsListFlow = null;
    
    public WordsViewModel(@org.jetbrains.annotations.NotNull()
    com.krishnanand.wordapp.repository.WordRepository wordRepository) {
        super();
    }
    
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.krishnanand.wordapp.model.Word>> getWordListFlow() {
        return null;
    }
}