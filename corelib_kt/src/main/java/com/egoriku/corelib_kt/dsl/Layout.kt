@file:Suppress("NOTHING_TO_INLINE")

package com.egoriku.corelib_kt.dsl

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

inline fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View =
        LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)

inline fun inflateViewGroup(viewGroup: ViewGroup, layoutId: Int, attachToRoot: Boolean = false): ViewGroup =
        LayoutInflater.from(viewGroup.context).inflate(layoutId, viewGroup, attachToRoot) as ViewGroup

inline fun inflateCustomView(layoutId: Int, viewGroup: ViewGroup): View =
        LayoutInflater.from(viewGroup.context).inflate(layoutId, viewGroup, true)
