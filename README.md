# WeatherForecastApp
A simple weather forecasting app built using Android Studio, Kotlin, Retrofit, Room, and Jetpack components. This app allows users to check the weather forecast for a specified city.

# Table of Contents
--Project Overview
--Features
--Technologies Used
--Setup and Installation
--Folder Structure
--File Descriptions
--License


# Project Overview
This project is an Android application that fetches and displays weather data for a specified location. It demonstrates the use of the MVVM (Model-View-ViewModel) architecture, data binding, and a combination of REST API calls with Retrofit and local data storage using Room. It is designed to be an introductory project for learning weather APIs, app UI layouts, and Android architecture components.

# Features
--Fetches real-time weather data for a city using a weather API.
--Displays temperature and weather conditions.
--Follows MVVM architecture.
--Stores weather data locally using Room Database.
--UI designed with Jetpack Compose.

# Technologies Used
--Android Studio: Development Environment.
--Kotlin: Programming language.
--Retrofit: REST API integration.
--Room: Local database storage.
--Jetpack Components: Including ViewModel and LiveData.
--GitHub: Version control.

# Setup and Installation
--Clone the Repository:
    git clone https://github.com/leo10manyam/WeatherForecastApp.git
    cd WeatherForecastApp
--Open the Project in Android Studio:
    Open Android Studio and select Open an Existing Project.
    Navigate to the cloned repository folder and select it.
    Configure the API Key:
--Register on a weather API provider (e.g., OpenWeatherMap) to obtain an API key.
    Open WeatherRepository.kt and replace "https://api.example.com/" with the base URL of the weather API provider.
    Replace "your_api_key_here" in API calls with your actual API key.
--Build and Run:
    Connect an Android device or launch an emulator.
    Run the app using Run > Run 'app' in Android Studio.
    
# File Descriptions
  1. MainActivity.kt
     : Entry point of the app. It initializes the WeatherViewModel and sets the UI content.
  2. WeatherViewModel.kt
      : Manages UI-related data and handles the communication between the Repository and UI components.
  3. WeatherRepository.kt
      : Handles data operations. Fetches weather data from the API and stores it in the Room database.
  4. ApiService.kt
      : Defines the interface for making API requests using Retrofit.
  5. WeatherResponse.kt
      : Data model for mapping the JSON response from the weather API.
  6. WeatherFragment.kt
      : The main UI fragment displaying the weather information.
  7. WeatherAdapter.kt
      : Optional adapter for displaying a list of weather items.
  8. activity_main.xml
     : Layout file for the main activity.
  9. fragment_weather.xml
     : Layout file for the weather fragment that displays city, temperature, and description.
  10. strings.xml
     : Contains text strings used in the app.
# License
    This project is licensed under the MIT License. See the LICENSE file for more information.
# Contributing
    Contributions are welcome! Please submit pull requests for any improvements or new features.
# Contact
    For any questions or suggestions, feel free to contact me via email.
    
