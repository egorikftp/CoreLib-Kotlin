package com.egoriku.corelib_kt.adapter

import android.content.Context
import android.graphics.drawable.Drawable
import android.support.v7.widget.RecyclerView
import android.view.View
import com.egoriku.corelib_kt.adapter.container.DrawableContainer
import com.egoriku.corelib_kt.adapter.container.StringContainer
import com.egoriku.corelib_kt.adapter.container.ViewContainer

open class AbstractViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val viewContainer = ViewContainer(itemView)
    private val stringContainer = StringContainer(itemView)
    private val drawableContainer = DrawableContainer(context)

    @Suppress("UNCHECKED_CAST")
    operator fun <T : View> get(viewId: Int): T = viewContainer.getView(viewId) as T

    fun getString(stringRes: Int): String = stringContainer.getRes(stringRes)

    fun getDrawable(drawableRes: Int): Drawable = drawableContainer.getRes(drawableRes)

    val context: Context
        get() = itemView.context
}
