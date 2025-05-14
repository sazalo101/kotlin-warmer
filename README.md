# Smart Flashcards

A modern Android flashcard app that learns with you, powered by AI. Create and study flashcards with AI-generated summaries, quiz questions, and related YouTube videos in English, Chinese, and Japanese.

## Features

- 📚 Smart Flashcards
  - Create cards manually or by pasting content
  - AI-generated summaries
  - Quiz questions
  - Related YouTube videos

- 📹 YouTube Link Support
  - Extract and summarize video transcripts
  - Generate quiz questions
  - Suggest related content

- ❓ AI-Generated Quiz Questions
  - Main question and follow-ups
  - Based on Bloom's Taxonomy
  - Progressive difficulty

- 🔤 Multilingual Support
  - English, Chinese, and Japanese
  - Language detection
  - Localized content

## Tech Stack

- Kotlin
- Jetpack Compose
- Material Design 3
- Room Database
- Retrofit
- YouTube Data API
- OpenAI API (for AI features)

## Setup

1. Clone the repository
2. Open the project in Android Studio
3. Add your API keys in `local.properties`:
   ```
   YOUTUBE_API_KEY=your_youtube_api_key
   OPENAI_API_KEY=your_openai_api_key
   ```
4. Build and run the project

## Architecture

The app follows MVVM architecture with Clean Architecture principles:

- `data`: Data layer with Room database and network calls
- `domain`: Business logic and use cases
- `ui`: Presentation layer with Compose UI
- `util`: Utility classes and extensions

## Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details. 