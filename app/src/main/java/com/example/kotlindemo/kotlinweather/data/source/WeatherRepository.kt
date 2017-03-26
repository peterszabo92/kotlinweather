package com.example.kotlindemo.kotlinweather.data.source

import com.example.kotlindemo.kotlinweather.data.model.CurrentWeather
import com.example.kotlindemo.kotlinweather.data.source.api.ApiManager
import io.reactivex.Observable
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val apiManager: ApiManager) : DataSource {

    override fun getCurrentWeatherByCity(cityName: String)
            : Observable<CurrentWeather> = apiManager.getCurrentWeatherByCity(cityName)
}