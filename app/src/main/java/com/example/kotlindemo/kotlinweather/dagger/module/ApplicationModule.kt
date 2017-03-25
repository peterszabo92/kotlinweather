package com.example.kotlindemo.kotlinweather.dagger.module

import android.app.Application
import com.example.kotlindemo.kotlinweather.dagger.scope.ApplicationScope
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(val application: Application) {

    @ApplicationScope
    @Provides
    internal fun provideApplication() = application

    @ApplicationScope
    @Provides
    internal fun provideApplicationContext() = application.applicationContext
}
