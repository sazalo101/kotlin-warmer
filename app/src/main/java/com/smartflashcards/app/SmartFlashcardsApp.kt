package com.smartflashcards.app

import android.app.Application
import androidx.room.Room
import com.smartflashcards.app.data.database.FlashcardDatabase

class SmartFlashcardsApp : Application() {
    lateinit var database: FlashcardDatabase
        private set

    override fun onCreate() {
        super.onCreate()
        instance = this
        
        database = Room.databaseBuilder(
            applicationContext,
            FlashcardDatabase::class.java,
            "flashcard_database"
        ).build()
    }

    companion object {
        lateinit var instance: SmartFlashcardsApp
            private set
    }
} 