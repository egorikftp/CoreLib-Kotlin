package com.egoriku.corelib_kt.dsl

import android.content.Context
import android.util.DisplayMetrics

/**
 * Copyright (C) 2018 egorikftp
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

inline val Context.displayMetrics: DisplayMetrics
    get() = resources.displayMetrics

inline val Context.screenWidth: Int
    get() = displayMetrics.widthPixels

inline val Context.screenHeight: Int
    get() = displayMetrics.heightPixels

inline val Context.screenDensity: Float
    get() = displayMetrics.density

inline val Context.scaledDensity: Float
    get() = displayMetrics.scaledDensity

fun Context.dp2px(dp: Number) = (dp.toFloat() * displayMetrics.density + 0.5f).toInt()

fun Context.sp2px(sp: Number) = (sp.toFloat() * displayMetrics.scaledDensity + 0.5f).toInt()

fun Context.px2dp(px: Number) = (px.toFloat() / displayMetrics.density + 0.5f).toInt()

fun Context.px2sp(px: Number) = (px.toFloat() / displayMetrics.scaledDensity + 0.5f).toInt()

fun Context.getStatusBarHeight(): Int {
    var result = 0
    val resourceId = resources.getIdentifier("status_bar_height", "dimen", "android")
    if (resourceId > 0) {
        result = resources.getDimensionPixelSize(resourceId)
    }
    return result
}

