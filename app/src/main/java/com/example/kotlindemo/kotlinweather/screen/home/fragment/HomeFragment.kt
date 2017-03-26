package com.example.kotlindemo.kotlinweather.screen.home.fragment

import android.util.Log
import android.view.View
import com.example.kotlindemo.kotlinweather.R
import com.example.kotlindemo.kotlinweather.activity.ActivityComponentProvider
import com.example.kotlindemo.kotlinweather.base.BaseFragment
import com.example.kotlindemo.kotlinweather.data.datacontroller.WeatherDataController
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class HomeFragment : BaseFragment() {

    @Inject
    lateinit var weatherDataController: WeatherDataController

    override fun getLayout() = R.layout.fragment_home

    override fun init(view: View) {
        ((activity as ActivityComponentProvider).getActivityComponent().inject(this))
        weatherDataController.getCurrentWeatherByCity("Budapest")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ currentWeather -> Log.wtf("TAG", currentWeather.main.toString()) },
                        Throwable::printStackTrace)
    }
}