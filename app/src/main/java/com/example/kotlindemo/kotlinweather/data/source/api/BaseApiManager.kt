package com.example.kotlindemo.kotlinweather.data.source.api

import com.example.kotlindemo.kotlinweather.BuildConfig
import com.google.gson.Gson
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

open class BaseApiManager {

    private val BASE_URL = "http://api.openweathermap.org/"
    protected val APP_ID = "b34f6bbf973096646b78941357f11da0"

    protected fun getRetrofit(okHttpClient: OkHttpClient, gsonConverterFactory: GsonConverterFactory): Retrofit {
        return Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(gsonConverterFactory)
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .build()
    }

    protected fun getGsonConverterFactory(): GsonConverterFactory {
        return GsonConverterFactory.create(Gson())
    }

    protected fun getLoggingInterceptor(): Interceptor {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return loggingInterceptor
    }

    protected fun getOkHttpClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
        if (BuildConfig.DEBUG) {
            builder.addInterceptor(getLoggingInterceptor())
        }
        return builder.build()
    }

}