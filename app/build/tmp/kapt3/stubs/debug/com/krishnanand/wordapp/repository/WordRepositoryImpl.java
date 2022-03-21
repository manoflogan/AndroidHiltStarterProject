package com.krishnanand.wordapp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/krishnanand/wordapp/repository/WordRepositoryImpl;", "Lcom/krishnanand/wordapp/repository/WordRepository;", "wordDao", "Lcom/krishnanand/wordapp/database/WordDao;", "(Lcom/krishnanand/wordapp/database/WordDao;)V", "getAllWords", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/krishnanand/wordapp/model/Word;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertWord", "", "word", "(Lcom/krishnanand/wordapp/model/Word;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WordRepositoryImpl implements com.krishnanand.wordapp.repository.WordRepository {
    private final com.krishnanand.wordapp.database.WordDao wordDao = null;
    
    @javax.inject.Inject()
    public WordRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.krishnanand.wordapp.database.WordDao wordDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertWord(@org.jetbrains.annotations.NotNull()
    com.krishnanand.wordapp.model.Word word, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllWords(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.krishnanand.wordapp.model.Word>>> continuation) {
        return null;
    }
}