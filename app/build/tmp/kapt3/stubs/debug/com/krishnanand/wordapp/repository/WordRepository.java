package com.krishnanand.wordapp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/krishnanand/wordapp/repository/WordRepository;", "", "getAllWords", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/krishnanand/wordapp/model/Word;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertWord", "", "word", "(Lcom/krishnanand/wordapp/model/Word;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface WordRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertWord(@org.jetbrains.annotations.NotNull()
    com.krishnanand.wordapp.model.Word word, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllWords(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.krishnanand.wordapp.model.Word>>> continuation);
}