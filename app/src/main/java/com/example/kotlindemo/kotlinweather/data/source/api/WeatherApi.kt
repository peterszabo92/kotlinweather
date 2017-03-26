package com.example.kotlindemo.kotlinweather.data.source.api

import com.example.kotlindemo.kotlinweather.data.model.CurrentWeather
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("data/2.5/weather")
    fun getCurrentWeatherByCity(@Query("q") cityName: String,
                                @Query("appid") appId: String): Observable<CurrentWeather>

}