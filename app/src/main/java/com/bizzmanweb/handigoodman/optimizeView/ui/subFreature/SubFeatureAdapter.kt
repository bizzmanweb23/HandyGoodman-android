package com.bizzmanweb.handigoodman.optimizeView.ui.subFreature

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bizzmanweb.handigoodman.base.BaseRecycleViewAdapter
import com.bizzmanweb.handigoodman.base.BaseViewHolder
import com.bizzmanweb.handigoodman.base.RecycleViewItemClickListener
import com.bizzmanweb.handigoodman.databinding.ItemSubFeatureBinding
import com.bizzmanweb.handigoodman.simpleView.ui.home.model.ServiceUiModel
import com.bizzmanweb.handigoodman.simpleView.ui.home.ui.SimpleViewDiffUtil

class SubFeatureAdapter : BaseRecycleViewAdapter<ServiceUiModel, SubFeatureViewHolder>(SimpleViewDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubFeatureViewHolder {
        val binding = ItemSubFeatureBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return SubFeatureViewHolder(binding)
    }
}

class SubFeatureViewHolder(
    private val binding: ItemSubFeatureBinding
) : BaseViewHolder<ServiceUiModel>(binding) {
    override fun bind(
        item: ServiceUiModel,
        listener: RecycleViewItemClickListener<ServiceUiModel>?
    ) {
        binding.apply {
            imageView.setImageDrawable(item.image)

            this.listener = listener
            this.item = item
        }
    }

}