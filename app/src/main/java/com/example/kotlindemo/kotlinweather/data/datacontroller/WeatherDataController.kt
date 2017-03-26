package com.example.kotlindemo.kotlinweather.data.datacontroller

import com.example.kotlindemo.kotlinweather.data.model.CurrentWeather
import com.example.kotlindemo.kotlinweather.data.source.WeatherRepository
import io.reactivex.Observable
import javax.inject.Inject

class WeatherDataController @Inject constructor(val weatherRepository: WeatherRepository) {

    fun getCurrentWeatherByCity(cityName: String): Observable<CurrentWeather>
            = weatherRepository.getCurrentWeatherByCity(cityName)

}