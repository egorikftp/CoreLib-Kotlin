package com.egoriku.corelib_kt.arch

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.annotation.CallSuper
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity<V : BaseContract.View, P : BaseContract.Presenter<V>> : AppCompatActivity(), BaseContract.View {

    protected var presenter: P? = null

    @Suppress("UNCHECKED_CAST")
    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProviders.of(this).get(BaseViewModel::class.java) as BaseViewModel<V, P>

        var isPresenterCreated = false

        if (viewModel.getPresenter() == null) {
            viewModel.setPresenter(initPresenter())
            isPresenterCreated = true
        }

        presenter = viewModel.getPresenter()?.apply {
            attachLifecycle(lifecycle)
            attachView(this as V)

            if (isPresenterCreated) onPresenterCreated()
        }
    }

    @CallSuper
    override fun onDestroy() {
        super.onDestroy()
        presenter?.apply {
            detachLifecycle(lifecycle)
            detachView()
        }
    }

    protected abstract fun initPresenter(): P
}
