@file:Suppress("NOTHING_TO_INLINE")

package com.egoriku.corelib_kt.timber

import android.annotation.SuppressLint
import timber.log.Timber

inline fun d(message: String, vararg args: Any) {
    Timber.d(message, args)
}

inline fun e(message: String, vararg args: Any) {
    Timber.e(message, args)
}

@SuppressLint("TimberExceptionLogging")
inline fun w(message: String, throwable: Throwable){
    Timber.w(throwable, message)
}