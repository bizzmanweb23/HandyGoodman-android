package com.bizzmanweb.handigoodman.optimizeView.ui.optimizeHome

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bizzmanweb.handigoodman.base.BaseRecycleViewAdapter
import com.bizzmanweb.handigoodman.base.BaseViewHolder
import com.bizzmanweb.handigoodman.base.RecycleViewItemClickListener
import com.bizzmanweb.handigoodman.databinding.ItemOptimizeViewOfferBinding

class OptimizeHomeOfferAdapter : BaseRecycleViewAdapter<OfferModel, OptimizeHomeOfferViewHolder>(
    OptimizeModelDiffUtil()
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OptimizeHomeOfferViewHolder {
        val binding: ItemOptimizeViewOfferBinding = ItemOptimizeViewOfferBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return OptimizeHomeOfferViewHolder(binding)
    }
}

class OptimizeHomeOfferViewHolder(
    private val binding: ItemOptimizeViewOfferBinding
) : BaseViewHolder<OfferModel>(binding) {
    override fun bind(item: OfferModel, listener: RecycleViewItemClickListener<OfferModel>?) {

        binding.apply {
            offerItemImage.setImageDrawable(item.image)
        }
    }

}