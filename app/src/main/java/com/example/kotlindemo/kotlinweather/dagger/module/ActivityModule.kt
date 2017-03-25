package com.example.kotlindemo.kotlinweather.dagger.module

import android.support.v7.app.AppCompatActivity
import com.example.kotlindemo.kotlinweather.dagger.scope.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(val mainActivity: AppCompatActivity) {

    @ActivityScope
    @Provides
    fun provideActivity(): AppCompatActivity = mainActivity
}
