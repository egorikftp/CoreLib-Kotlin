@file:Suppress("NOTHING_TO_INLINE")

package com.egoriku.corelib_kt.dsl

import android.content.Context
import android.support.annotation.ColorRes
import android.support.annotation.DrawableRes
import android.support.v4.content.ContextCompat
import android.support.v7.content.res.AppCompatResources

inline fun Context.colorCompat(@ColorRes colorInt: Int) = ContextCompat.getColor(this, colorInt)

inline fun Context.drawableCompat(@DrawableRes resId: Int) = AppCompatResources.getDrawable(this, resId)