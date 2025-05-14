package com.smartflashcards.app.data.database.dao

import androidx.room.*
import com.smartflashcards.app.data.database.entity.Flashcard
import com.smartflashcards.app.data.database.entity.Quiz
import com.smartflashcards.app.data.database.entity.RelatedVideo
import kotlinx.coroutines.flow.Flow

@Dao
interface FlashcardDao {
    @Transaction
    @Query("SELECT * FROM flashcards ORDER BY createdAt DESC")
    fun getAllFlashcards(): Flow<List<Flashcard>>

    @Query("SELECT * FROM flashcards WHERE id = :id")
    suspend fun getFlashcardById(id: Long): Flashcard?

    @Query("SELECT * FROM quizzes WHERE flashcardId = :flashcardId")
    suspend fun getQuizzesForFlashcard(flashcardId: Long): List<Quiz>

    @Query("SELECT * FROM related_videos WHERE flashcardId = :flashcardId")
    suspend fun getRelatedVideosForFlashcard(flashcardId: Long): List<RelatedVideo>

    @Insert
    suspend fun insertFlashcard(flashcard: Flashcard): Long

    @Insert
    suspend fun insertQuiz(quiz: Quiz): Long

    @Insert
    suspend fun insertRelatedVideo(relatedVideo: RelatedVideo): Long

    @Update
    suspend fun updateFlashcard(flashcard: Flashcard)

    @Delete
    suspend fun deleteFlashcard(flashcard: Flashcard)

    @Query("SELECT * FROM flashcards WHERE language = :language ORDER BY createdAt DESC")
    fun getFlashcardsByLanguage(language: String): Flow<List<Flashcard>>

    @Query("UPDATE flashcards SET masteryLevel = :masteryLevel, lastReviewedAt = :timestamp, reviewCount = reviewCount + 1 WHERE id = :flashcardId")
    suspend fun updateFlashcardMastery(flashcardId: Long, masteryLevel: Int, timestamp: Long = System.currentTimeMillis())
} 