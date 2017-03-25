package com.example.kotlindemo.kotlinweather.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.example.kotlindemo.kotlinweather.MainApplication
import com.example.kotlindemo.kotlinweather.R
import com.example.kotlindemo.kotlinweather.TestClass
import com.example.kotlindemo.kotlinweather.dagger.component.ActivityComponent
import com.example.kotlindemo.kotlinweather.dagger.component.DaggerActivityComponent
import com.example.kotlindemo.kotlinweather.dagger.module.ActivityModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @BindView(R.id.hello_text) lateinit var helloText: TextView

    private lateinit var activityComponent: ActivityComponent
    @Inject lateinit var test: TestClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        activityComponent = DaggerActivityComponent.builder()
                .applicationComponent((application as MainApplication).applicationComponent)
                .activityModule(ActivityModule(this))
                .build()
        activityComponent.inject(this)
    }

    override fun onResume() {
        super.onResume()
        helloText.text = "TEST TEST TEST"
    }
}
