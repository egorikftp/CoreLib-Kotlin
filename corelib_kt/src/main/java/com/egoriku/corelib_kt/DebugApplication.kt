package com.egoriku.corelib_kt

import android.app.Application
import timber.log.Timber

open class DebugApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }else{
            Timber.plant()
        }
    }
}
