package com.smartflashcards.app.data.database.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "quizzes",
    foreignKeys = [
        ForeignKey(
            entity = Flashcard::class,
            parentColumns = ["id"],
            childColumns = ["flashcardId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Quiz(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val flashcardId: Long,
    val question: String,
    val answer: String,
    val type: String, // MAIN, FOLLOW_UP
    val bloomLevel: String, // UNDERSTAND, APPLY, ANALYZE
    val language: String
) 