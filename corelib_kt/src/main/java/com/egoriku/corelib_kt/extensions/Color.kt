@file:Suppress("NOTHING_TO_INLINE")

package com.egoriku.corelib_kt.extensions

import android.content.Context
import android.support.annotation.ColorRes
import android.support.v4.content.ContextCompat

inline fun colorCompat(context: Context, @ColorRes colorInt: Int): Int {
    return ContextCompat.getColor(context, colorInt)
}
