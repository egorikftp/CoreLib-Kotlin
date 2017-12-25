package com.egoriku.corelib_kt.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import com.egoriku.corelib_kt.adapter.container.ViewContainer

open class AbstractViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val viewContainer = ViewContainer(itemView)

    @Suppress("UNCHECKED_CAST")
    operator fun <T : View> get(viewId: Int): T = viewContainer.getView(viewId) as T
}
