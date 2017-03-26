package com.example.kotlindemo.kotlinweather.data.source.api

import com.example.kotlindemo.kotlinweather.data.model.CurrentWeather
import io.reactivex.Observable
import javax.inject.Inject

class DefaultApiManager @Inject constructor() : BaseApiManager(), ApiManager {

    private var weatherApi: WeatherApi = getRetrofit(getOkHttpClient(), getGsonConverterFactory())
            .create(WeatherApi::class.java)

    override fun getCurrentWeatherByCity(cityName: String)
            : Observable<CurrentWeather> = weatherApi.getCurrentWeatherByCity(cityName, APP_ID)
}