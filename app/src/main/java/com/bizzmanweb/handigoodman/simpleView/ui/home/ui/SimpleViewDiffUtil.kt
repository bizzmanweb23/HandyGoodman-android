package com.bizzmanweb.handigoodman.simpleView.ui.home.ui

import androidx.recyclerview.widget.DiffUtil
import com.bizzmanweb.handigoodman.simpleView.ui.home.model.ServiceUiModel

class SimpleViewDiffUtil : DiffUtil.ItemCallback<ServiceUiModel>() {
    override fun areItemsTheSame(oldItem: ServiceUiModel, newItem: ServiceUiModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ServiceUiModel, newItem: ServiceUiModel): Boolean {
        return oldItem == newItem
    }
}