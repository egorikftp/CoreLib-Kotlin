package com.egoriku.corelib_kt.arch

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.os.Bundle

abstract class BasePresenter<V : BaseContract.View> : LifecycleObserver, BaseContract.Presenter<V> {

    val bundle: Bundle by lazy {
        Bundle()
    }

    private var view: V? = null

    override fun getView() = view

    override fun attachLifecycle(lifecycle: Lifecycle) {
        lifecycle.addObserver(this)
    }

    override fun detachLifecycle(lifecycle: Lifecycle) {
        lifecycle.removeObserver(this)
    }

    override fun attachView(view: V) {
        this.view = view
    }

    override fun detachView() {
        view = null
    }

    override fun isViewAttached() = view != null

    override fun getStateBundle() = bundle

    override fun onPresenterDestroy() {
        if (!bundle.isEmpty) bundle.clear()
    }

    override fun onPresenterCreated() {
        //NO-OP
    }
}
