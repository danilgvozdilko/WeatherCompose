package com.example.weathercompose.repository

import com.example.weathercompose.data.WeatherDao
import com.example.weathercompose.model.Favorite
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WeatherDbRepository @Inject constructor(private val weatherDao: WeatherDao) {

    fun getFavorites(): Flow<List<Favorite>> = weatherDao.getFavorites()
    suspend fun insertFavorite(favorite: Favorite) = weatherDao.insertFavorite(favorite)
    suspend fun updateFavorite(favorite: Favorite) = weatherDao.updateFavorite(favorite)
    suspend fun deleteAllFavorites() = weatherDao.deleteAllFavorites()
    suspend fun deleteFavorite(favorite: Favorite) = weatherDao.deleteFavorite(favorite)
    suspend fun getFavById(city: String): Favorite = weatherDao.getFavById(city)

    fun getUnits(): Flow<List<com.example.weathercompose.model.Unit>> = weatherDao.getUnits()
    suspend fun insertUnit(unit: com.example.weathercompose.model.Unit) =
        weatherDao.insertUnit(unit)

    suspend fun updateUnit(unit: com.example.weathercompose.model.Unit) =
        weatherDao.updateUnit(unit)

    suspend fun deleteAllUnits() = weatherDao.deleteAllUnits()
    suspend fun deleteUnit(unit: com.example.weathercompose.model.Unit) =
        weatherDao.deleteUnit(unit)


}