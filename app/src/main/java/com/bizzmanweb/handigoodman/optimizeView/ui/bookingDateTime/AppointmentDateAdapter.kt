package com.bizzmanweb.handigoodman.optimizeView.ui.bookingDateTime

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bizzmanweb.handigoodman.base.BaseRecycleViewAdapter
import com.bizzmanweb.handigoodman.base.BaseViewHolder
import com.bizzmanweb.handigoodman.base.RecycleViewItemClickListener
import com.bizzmanweb.handigoodman.databinding.ItemAppointmentDateBinding

class AppointmentDateAdapter :
    BaseRecycleViewAdapter<String, AppointDateViewHolder>(SingleStringDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppointDateViewHolder {
        val binding = ItemAppointmentDateBinding.inflate(
            LayoutInflater.from(
                parent.context
            ),
            parent,
            false
        )
        return AppointDateViewHolder(binding)
    }
}

class AppointDateViewHolder(
    private val binding: ItemAppointmentDateBinding
) : BaseViewHolder<String>(binding) {
    override fun bind(item: String, listener: RecycleViewItemClickListener<String>?) {
        binding.appartMentDoorNoText.text = item
    }

}