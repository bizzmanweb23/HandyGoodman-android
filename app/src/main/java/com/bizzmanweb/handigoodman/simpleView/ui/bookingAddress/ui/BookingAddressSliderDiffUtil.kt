package com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.ui

import androidx.recyclerview.widget.DiffUtil
import com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.model.BookingAddressUiModel

class BookingAddressSliderDiffUtil: DiffUtil.ItemCallback<BookingAddressUiModel>() {
    override fun areItemsTheSame(
        oldItem: BookingAddressUiModel,
        newItem: BookingAddressUiModel
    ): Boolean = oldItem.id == newItem.id


    override fun areContentsTheSame(
        oldItem: BookingAddressUiModel,
        newItem: BookingAddressUiModel
    ): Boolean = oldItem == newItem
}