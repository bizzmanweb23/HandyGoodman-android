package com.bizzmanweb.handigoodman.optimizeView.ui.bookingDateTime

import androidx.recyclerview.widget.DiffUtil

class SingleStringDiffUtil: DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
       return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
      return oldItem == newItem
    }
}