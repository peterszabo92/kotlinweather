package com.example.kotlindemo.kotlinweather

import android.app.Application
import com.example.kotlindemo.kotlinweather.dagger.component.ApplicationComponent
import com.example.kotlindemo.kotlinweather.dagger.component.DaggerApplicationComponent
import com.example.kotlindemo.kotlinweather.dagger.module.ApplicationModule

class MainApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = initApplicationComponent()
    }

    private fun initApplicationComponent(): ApplicationComponent {
        return DaggerApplicationComponent
                .builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}