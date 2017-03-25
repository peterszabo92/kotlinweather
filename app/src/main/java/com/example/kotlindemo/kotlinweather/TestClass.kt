package com.example.kotlindemo.kotlinweather

import android.content.Context
import android.util.Log
import javax.inject.Inject

class TestClass @Inject constructor(var context: Context) {init {
    Log.wtf("TAG", "App info: ${context.applicationInfo}")
}

}