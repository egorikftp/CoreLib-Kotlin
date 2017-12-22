package com.egoriku.core_lib_kt

import android.os.Handler
import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.OnLifecycleEvent
import com.egoriku.corelib_kt.arch.BasePresenter
import com.egoriku.corelib_kt.timber.d


class MainPresenter : BasePresenter<MainContract.View>(), MainContract.Presenter {

    private val PROGRESS_BAR_PERCENT_KEY = "progress_bar_percent_key"
    private val PROGRESS_BAR_STATE_KEY = "progress_bar_state_key"
    private val TAG = "MainActivityPresenter"

    private val viewStateBundle = stateBundle
    private var progressTime: Long = 0


    override fun doSomeWithDelay(delay: Long) {
        progressTime = delay
        if (isViewAttached) {
            view.showProgress()
            viewStateBundle.putBoolean(PROGRESS_BAR_STATE_KEY, true)
        }

        Handler().postDelayed({
            if (isViewAttached) {
                view.hideProgress()
                viewStateBundle.putBoolean(PROGRESS_BAR_STATE_KEY, false)
                viewStateBundle.putInt(PROGRESS_BAR_PERCENT_KEY, 0)
            }
        }, delay)

        updateProgress()
    }

    private fun updateProgress() {
        Handler().postDelayed({
            if (isViewAttached) {
                var percent = viewStateBundle.getInt(PROGRESS_BAR_PERCENT_KEY)
                viewStateBundle.putInt(PROGRESS_BAR_PERCENT_KEY, ++percent)
                view.updateProgressPercentage(percent)
                if (viewStateBundle.getBoolean(PROGRESS_BAR_STATE_KEY))
                    updateProgress()
                else {
                    viewStateBundle.putInt(PROGRESS_BAR_PERCENT_KEY, 0)
                }
            }
        }, progressTime / 100)
    }

    @OnLifecycleEvent(value = Lifecycle.Event.ON_CREATE)
    protected fun onCreate() {
        if (viewStateBundle.getBoolean(PROGRESS_BAR_STATE_KEY)) {
            if (isViewAttached)
                view.showProgress()
        }
    }

    @OnLifecycleEvent(value = Lifecycle.Event.ON_DESTROY)
    protected fun onDestroy() {
        if (isViewAttached)
            view.hideProgress()
    }

    override fun onPresenterDestroy() {
        super.onPresenterDestroy()
        d(TAG, "Presenter destroyed")
    }
}