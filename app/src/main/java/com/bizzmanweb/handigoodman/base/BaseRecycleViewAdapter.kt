package com.bizzmanweb.handigoodman.base

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

abstract class BaseRecycleViewAdapter<T, VH : BaseViewHolder<T>>(
    callback: DiffUtil.ItemCallback<T>
) : ListAdapter<T, VH>(callback) {

    private var clickListener: RecycleViewItemClickListener<T>? = null

    fun setListener(listener: RecycleViewItemClickListener<T>) {
        clickListener = listener
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(
            item = getItem(position),
            listener = clickListener
        )
    }

}