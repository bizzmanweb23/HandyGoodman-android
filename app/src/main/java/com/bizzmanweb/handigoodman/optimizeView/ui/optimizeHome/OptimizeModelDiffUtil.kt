package com.bizzmanweb.handigoodman.optimizeView.ui.optimizeHome

import androidx.recyclerview.widget.DiffUtil

class OptimizeModelDiffUtil: DiffUtil.ItemCallback<OfferModel>() {
    override fun areItemsTheSame(oldItem: OfferModel, newItem: OfferModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: OfferModel, newItem: OfferModel): Boolean = oldItem == newItem
    
}