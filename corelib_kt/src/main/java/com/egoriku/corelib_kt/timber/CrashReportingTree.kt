package com.egoriku.corelib_kt.timber

import android.util.Log
import timber.log.Timber

class CrashReportingTree : Timber.Tree() {

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        if (priority == Log.VERBOSE || priority == Log.DEBUG) {
            return
        }

        if (t != null) {
            if (priority == Log.ERROR) {
                e(t)
            } else if (priority == Log.WARN) {
                w(t)
            }
        }
    }
}
