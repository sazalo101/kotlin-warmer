package com.smartflashcards.app.ui

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.smartflashcards.app.ui.screens.home.HomeScreen
import com.smartflashcards.app.ui.screens.create.CreateFlashcardScreen
import com.smartflashcards.app.ui.screens.study.StudyScreen

@Composable
fun SmartFlashcardsApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(
                onCreateFlashcard = { navController.navigate("create") },
                onStudyFlashcards = { navController.navigate("study") }
            )
        }
        composable("create") {
            CreateFlashcardScreen(
                onNavigateBack = { navController.popBackStack() }
            )
        }
        composable("study") {
            StudyScreen(
                onNavigateBack = { navController.popBackStack() }
            )
        }
    }
} 