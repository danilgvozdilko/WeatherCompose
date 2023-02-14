package com.example.weathercompose.screens.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weathercompose.data.DataOrException
import com.example.weathercompose.model.Weather
import com.example.weathercompose.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: WeatherRepository) : ViewModel() {

    suspend fun getWeatherData(
        city: String,
        units: String
    ): DataOrException<Weather, Boolean, Exception> {
        return repository.getWeather(city, units)
    }

    init {
        viewModelScope.launch {
            getWeatherData("Kyiv","imperial")
        }
    }
}

