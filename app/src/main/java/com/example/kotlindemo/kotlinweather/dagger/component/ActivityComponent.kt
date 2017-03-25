package com.example.kotlindemo.kotlinweather.dagger.component

import com.example.kotlindemo.kotlinweather.activity.MainActivity
import com.example.kotlindemo.kotlinweather.dagger.module.ActivityModule
import com.example.kotlindemo.kotlinweather.dagger.scope.ActivityScope
import dagger.Component

@ActivityScope
@Component(
        dependencies = arrayOf(ApplicationComponent::class),
        modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
}