package com.example.weatherapp

import androidx.lifecycle.MutableLiveData
import com.example.weatherapp.data.ApiService
import com.example.weatherapp.data.models.WeatherResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WeatherRepository {
    private val apiService: ApiService
    val weatherData = MutableLiveData<WeatherResponse>()

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.example.com/") // Replace with actual API base URL
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        apiService = retrofit.create(ApiService::class.java)
    }

    suspend fun fetchWeather(city: String) {
        withContext(Dispatchers.IO) {
            val response = apiService.getWeather(city)
            if (response.isSuccessful) {
                weatherData.postValue(response.body())
            }
        }
    }
}
