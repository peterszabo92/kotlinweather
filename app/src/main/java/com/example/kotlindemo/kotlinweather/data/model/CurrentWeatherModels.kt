package com.example.kotlindemo.kotlinweather.data.model

data class Coord(val lon: Float, val lat: Float)
data class Weather(val id: Int, val main: String, val description: String, val icon: String)
data class Main(val temp: Float, val pressure: Float, val humidity: Int, val temp_min: Float, val temp_max: Float)
data class Wind(val speed: Float, val deg: Int)
data class Clouds(val all: Int)
data class Sys(val type: Int, val id: Int, val message: Float, val country: String, val sunrise: Int, val sunset: Int)