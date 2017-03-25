package com.example.kotlindemo.kotlinweather.dagger.component

import android.content.Context
import com.example.kotlindemo.kotlinweather.dagger.module.ApplicationModule
import com.example.kotlindemo.kotlinweather.dagger.scope.ApplicationScope
import dagger.Component

@ApplicationScope
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun getContext(): Context
}