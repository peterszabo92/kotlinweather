package com.example.kotlindemo.kotlinweather.dagger.component

import com.example.kotlindemo.kotlinweather.activity.MainActivity
import com.example.kotlindemo.kotlinweather.dagger.module.ActivityModule
import com.example.kotlindemo.kotlinweather.dagger.module.ApiModule
import com.example.kotlindemo.kotlinweather.dagger.module.DataControllerModule
import com.example.kotlindemo.kotlinweather.dagger.module.DataSourceModule
import com.example.kotlindemo.kotlinweather.dagger.scope.ActivityScope
import com.example.kotlindemo.kotlinweather.screen.home.fragment.HomeFragment
import dagger.Component

@ActivityScope
@Component(
        dependencies = arrayOf(ApplicationComponent::class),
        modules = arrayOf(
                ActivityModule::class,
                ApiModule::class,
                DataSourceModule::class,
                DataControllerModule::class
        ))
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(homeFragment: HomeFragment)
}