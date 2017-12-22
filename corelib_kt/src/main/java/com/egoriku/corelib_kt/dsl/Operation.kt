package com.egoriku.corelib_kt.dsl

inline fun consume(f: () -> Unit): Boolean {
    f()
    return true
}
