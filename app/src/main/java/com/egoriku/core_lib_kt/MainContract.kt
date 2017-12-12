package com.egoriku.core_lib_kt

import com.egoriku.corelib_kt.arch.BaseContract

interface MainContract {

    interface View : BaseContract.View {

        fun showProgress()
        fun hideProgress()
        fun updateProgressPercentage(percent: Int)
    }

    interface Presenter:BaseContract.Presenter<MainContract.View>{
        fun doSomeWithDelay(delay: Long)
    }
}