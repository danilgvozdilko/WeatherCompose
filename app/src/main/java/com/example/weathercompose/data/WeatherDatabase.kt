package com.example.weathercompose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.weathercompose.model.Favorite

@Database(entities = [Favorite::class, com.example.weathercompose.model.Unit::class], version = 6, exportSchema = false)
abstract class WeatherDatabase: RoomDatabase() {
    abstract fun weatherDao(): WeatherDao
}