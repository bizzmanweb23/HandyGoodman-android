package com.bizzmanweb.handigoodman.simpleView.ui.home.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bizzmanweb.handigoodman.base.BaseRecycleViewAdapter
import com.bizzmanweb.handigoodman.base.BaseViewHolder
import com.bizzmanweb.handigoodman.base.RecycleViewItemClickListener
import com.bizzmanweb.handigoodman.databinding.ItemSimpleViewServiceBinding
import com.bizzmanweb.handigoodman.simpleView.ui.home.model.ServiceUiModel

class SimpleViewServiceAdapter :
    BaseRecycleViewAdapter<ServiceUiModel, SimpleViewServiceViewHolder>(SimpleViewDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewServiceViewHolder {
        val binding = ItemSimpleViewServiceBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return SimpleViewServiceViewHolder(binding)
    }
}

class SimpleViewServiceViewHolder(
    private val binding: ItemSimpleViewServiceBinding
) : BaseViewHolder<ServiceUiModel>(binding) {

    override fun bind(
        item: ServiceUiModel,
        listener: RecycleViewItemClickListener<ServiceUiModel>?
    ) {
        binding.apply {
            this.item = item
            this.listener = listener
        }
    }

}