package com.egoriku.corelib_kt.extensions

import android.content.Context
import android.support.annotation.DrawableRes
import android.support.v7.content.res.AppCompatResources

fun drawableCompat(context: Context, @DrawableRes resourceId: Int) = AppCompatResources.getDrawable(context, resourceId)
