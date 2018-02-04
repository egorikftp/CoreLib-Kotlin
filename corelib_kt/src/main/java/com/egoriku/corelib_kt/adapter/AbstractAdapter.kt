package com.egoriku.corelib_kt.adapter

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

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.egoriku.corelib_kt.dsl.inflate

abstract class AbstractAdapter<Item> : RecyclerView.Adapter<AbstractViewHolder>() {

    abstract fun onCreateHolder(itemView: View, viewType: Int): AbstractViewHolder

    abstract fun onBindHolder(holder: AbstractViewHolder, item: Item, position: Int, viewType: Int)

    abstract fun getItem(position: Int): Item

    @LayoutRes
    abstract fun getLayout(): Int

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AbstractViewHolder =
            onCreateHolder(parent.inflate(getLayout()), viewType)

    override fun onBindViewHolder(holder: AbstractViewHolder, position: Int) {
        onBindHolder(holder, getItem(position), position, getItemViewType(position))
    }
}
