package com.smartflashcards.app.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.smartflashcards.app.data.database.dao.FlashcardDao
import com.smartflashcards.app.data.database.entity.Flashcard
import com.smartflashcards.app.data.database.entity.Quiz
import com.smartflashcards.app.data.database.entity.RelatedVideo
import com.smartflashcards.app.data.database.util.Converters

@Database(
    entities = [
        Flashcard::class,
        Quiz::class,
        RelatedVideo::class
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class FlashcardDatabase : RoomDatabase() {
    abstract fun flashcardDao(): FlashcardDao
} 