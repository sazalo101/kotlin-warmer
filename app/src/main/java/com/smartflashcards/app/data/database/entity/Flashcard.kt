package com.smartflashcards.app.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "flashcards")
data class Flashcard(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val term: String,
    val summary: String,
    val language: String,
    val sourceUrl: String? = null,
    val sourceType: String, // TEXT, YOUTUBE, MANUAL
    val createdAt: Long = System.currentTimeMillis(),
    val lastReviewedAt: Long? = null,
    val reviewCount: Int = 0,
    val masteryLevel: Int = 0 // 0-5, where 5 is fully mastered
) 