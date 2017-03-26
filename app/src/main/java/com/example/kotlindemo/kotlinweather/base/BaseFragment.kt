package com.example.kotlindemo.kotlinweather.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife
import com.example.kotlindemo.kotlinweather.activity.ActivityComponentProvider
import com.example.kotlindemo.kotlinweather.dagger.component.ActivityComponent
import io.reactivex.disposables.CompositeDisposable

abstract class BaseFragment: Fragment() {

    protected var compositeDisposable = CompositeDisposable()

    protected abstract fun init(view: View)

    protected abstract fun getLayout(): Int

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(getLayout(), container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ButterKnife.bind(this, view!!)
        init(view)
    }

    override fun onResume() {
        super.onResume()
        compositeDisposable = CompositeDisposable()
    }

    override fun onPause() {
        super.onPause()
        compositeDisposable.dispose()
        compositeDisposable.clear()
    }

    protected fun getActivityComponent(): ActivityComponent {
        return (activity as ActivityComponentProvider).getActivityComponent()
    }
}