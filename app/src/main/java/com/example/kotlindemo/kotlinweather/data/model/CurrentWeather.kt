package com.example.kotlindemo.kotlinweather.data.model

data class CurrentWeather(
        val coord: Coord,
        val weather: ArrayList<Weather>,
        val base: String,
        val main: Main,
        val visibility: Int,
        val wind: Wind,
        val clouds: Clouds,
        val dt: Int,
        val sys: Sys,
        val id: Int,
        val name: String,
        val cod: Int
)