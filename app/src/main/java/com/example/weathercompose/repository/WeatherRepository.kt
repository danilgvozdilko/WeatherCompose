package com.example.weathercompose.repository

import android.util.Log
import com.example.weathercompose.data.DataOrException
import com.example.weathercompose.model.Weather
import com.example.weathercompose.network.WeatherApi
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val weatherApi: WeatherApi) {
    suspend fun getWeather(
        cityQuery: String,
        units: String
    ): DataOrException<Weather, Boolean, Exception> {
        val response = try {
            weatherApi.getWeather(cityQuery, units = units)
        } catch (e: Exception) {
            Log.d("TAG", "getWeather:$e ")
            return DataOrException(e = e)
        }
        return DataOrException(data = response)
        Log.d("TAG", "getWeather:$response ")

    }
}