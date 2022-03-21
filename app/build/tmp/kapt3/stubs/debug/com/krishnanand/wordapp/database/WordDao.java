package com.krishnanand.wordapp.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\'\u00a8\u0006\t"}, d2 = {"Lcom/krishnanand/wordapp/database/WordDao;", "", "getAllWords", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/krishnanand/wordapp/model/Word;", "insertWord", "", "instance", "app_debug"})
public abstract interface WordDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insertWord(@org.jetbrains.annotations.NotNull()
    com.krishnanand.wordapp.model.Word instance);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM words")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.krishnanand.wordapp.model.Word>> getAllWords();
}