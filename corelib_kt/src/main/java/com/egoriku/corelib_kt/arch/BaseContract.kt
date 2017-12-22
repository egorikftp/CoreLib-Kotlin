package com.egoriku.corelib_kt.arch


import android.arch.lifecycle.Lifecycle
import android.os.Bundle

interface BaseContract {

    interface View

    interface Presenter<V : BaseContract.View> {

        fun getStateBundle(): Bundle
        fun getView(): V?
        fun isViewAttached(): Boolean

        fun attachLifecycle(lifecycle: Lifecycle)
        fun detachLifecycle(lifecycle: Lifecycle)

        fun attachView(view: V)
        fun detachView()

        fun onPresenterCreated()
        fun onPresenterDestroy()
    }
}
