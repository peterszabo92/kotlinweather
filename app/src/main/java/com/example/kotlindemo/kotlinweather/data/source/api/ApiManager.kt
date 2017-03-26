package com.example.kotlindemo.kotlinweather.data.source.api

import com.example.kotlindemo.kotlinweather.data.model.CurrentWeather
import io.reactivex.Observable

interface ApiManager {

    fun getCurrentWeatherByCity(cityName: String): Observable<CurrentWeather>

}