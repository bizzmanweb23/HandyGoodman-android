package com.bizzmanweb.handigoodman.optimizeView.ui.bookingDateTime

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bizzmanweb.handigoodman.base.BaseRecycleViewAdapter
import com.bizzmanweb.handigoodman.base.BaseViewHolder
import com.bizzmanweb.handigoodman.base.RecycleViewItemClickListener
import com.bizzmanweb.handigoodman.databinding.ItemAppointmentDoorBinding

class SingleTextViewAdapter : BaseRecycleViewAdapter<String, SingleTextViewViewHolder>(
    SingleStringDiffUtil()
){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SingleTextViewViewHolder {
        val binding = ItemAppointmentDoorBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return SingleTextViewViewHolder(binding)
    }
}

class SingleTextViewViewHolder(
    private val binding: ItemAppointmentDoorBinding
): BaseViewHolder<String>(binding){
    override fun bind(item: String, listener: RecycleViewItemClickListener<String>?) {
        binding.appartMentDoorNoText.text = item
    }

}