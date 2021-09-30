package com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bizzmanweb.handigoodman.base.BaseRecycleViewAdapter
import com.bizzmanweb.handigoodman.base.BaseViewHolder
import com.bizzmanweb.handigoodman.base.RecycleViewItemClickListener
import com.bizzmanweb.handigoodman.databinding.ItemBookingAdderssSliderBinding
import com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.model.BookingAddressUiModel

class BookingAddressImageSliderAdapter :
    BaseRecycleViewAdapter<BookingAddressUiModel, BookingAddressImageSliderViewHolder>(BookingAddressSliderDiffUtil()) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BookingAddressImageSliderViewHolder {
        val binding = ItemBookingAdderssSliderBinding.inflate(
            LayoutInflater.from(
                parent.context
            ),
            parent,
            false
        )
        return BookingAddressImageSliderViewHolder(binding)
    }
}


class BookingAddressImageSliderViewHolder(
    private val binding: ItemBookingAdderssSliderBinding
) : BaseViewHolder<BookingAddressUiModel>(binding) {
    override fun bind(
        item: BookingAddressUiModel,
        listener: RecycleViewItemClickListener<BookingAddressUiModel>?
    ) {

        binding.apply {
            sliderImage.setImageDrawable(item.image)
        }
    }

}