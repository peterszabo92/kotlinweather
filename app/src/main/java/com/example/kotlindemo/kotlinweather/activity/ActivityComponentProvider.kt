package com.example.kotlindemo.kotlinweather.activity

import com.example.kotlindemo.kotlinweather.dagger.component.ActivityComponent

interface ActivityComponentProvider {

    fun getActivityComponent(): ActivityComponent

}