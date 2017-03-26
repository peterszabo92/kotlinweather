package com.example.kotlindemo.kotlinweather.dagger.module

import com.example.kotlindemo.kotlinweather.dagger.scope.ActivityScope
import com.example.kotlindemo.kotlinweather.data.source.api.ApiManager
import com.example.kotlindemo.kotlinweather.data.source.api.DefaultApiManager
import dagger.Module
import dagger.Provides

@Module
class ApiModule {

    @ActivityScope
    @Provides
    fun provideApiManager(): ApiManager = DefaultApiManager()

}