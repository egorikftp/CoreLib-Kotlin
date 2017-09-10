package com.egoriku.core_lib_kt.extensions

inline fun consume(f: () -> Unit): Boolean {
    f()
    return true
}
