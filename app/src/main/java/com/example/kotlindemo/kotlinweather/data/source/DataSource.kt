package com.example.kotlindemo.kotlinweather.data.source

import com.example.kotlindemo.kotlinweather.data.model.CurrentWeather
import io.reactivex.Observable

interface DataSource {

    fun getCurrentWeatherByCity(cityName: String): Observable<CurrentWeather>

}