package com.krishnanand.wordapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Data class for Word
 */
@Entity(tableName = "words")
data class Word(
    @PrimaryKey val id: Int,
    val word: String
)
