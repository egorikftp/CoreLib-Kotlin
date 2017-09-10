package com.egoriku.corelib_kt.extensions

inline fun consume(f: () -> Unit): Boolean {
    f()
    return true
}
