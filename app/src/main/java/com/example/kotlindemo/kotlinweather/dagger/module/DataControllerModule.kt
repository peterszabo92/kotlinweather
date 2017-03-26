package com.example.kotlindemo.kotlinweather.dagger.module

import com.example.kotlindemo.kotlinweather.dagger.scope.ActivityScope
import com.example.kotlindemo.kotlinweather.data.datacontroller.WeatherDataController
import com.example.kotlindemo.kotlinweather.data.source.WeatherRepository
import dagger.Module
import dagger.Provides

@Module
class DataControllerModule {

    @ActivityScope
    @Provides
    fun provideWeatherDataController(weatherRepository: WeatherRepository):
            WeatherDataController = WeatherDataController(weatherRepository)

}