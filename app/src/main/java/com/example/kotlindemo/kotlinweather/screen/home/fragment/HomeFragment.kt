package com.example.kotlindemo.kotlinweather.screen.home.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlindemo.kotlinweather.R
import com.example.kotlindemo.kotlinweather.activity.MainActivity
import com.example.kotlindemo.kotlinweather.data.datacontroller.WeatherDataController
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class HomeFragment : Fragment() {

    @Inject
    lateinit var weatherDataController: WeatherDataController

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ((activity as MainActivity).activityComponent.inject(this))
        weatherDataController.getCurrentWeatherByCity("Budapest")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ currentWeather -> Log.wtf("TAG", currentWeather.main.toString()) },
                        Throwable::printStackTrace)
    }
}
