package com.example.kotlindemo.kotlinweather.dagger.module

import com.example.kotlindemo.kotlinweather.dagger.scope.ActivityScope
import com.example.kotlindemo.kotlinweather.data.source.WeatherRepository
import com.example.kotlindemo.kotlinweather.data.source.api.ApiManager
import dagger.Module
import dagger.Provides

@Module
class DataSourceModule {

    @ActivityScope
    @Provides
    fun provideWeatherRepository(apiManager: ApiManager): WeatherRepository
            = WeatherRepository(apiManager)

}
