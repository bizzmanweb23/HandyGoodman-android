package com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.model

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.bizzmanweb.handigoodman.R

data class BookingAddressUiModel(
    val id: Int,
    val image: Drawable?
)

fun getSliderImages(context: Context) =
    mutableListOf<BookingAddressUiModel>().apply {
        add(BookingAddressUiModel(0, ContextCompat.getDrawable(context, R.drawable.slider2)))
        add(BookingAddressUiModel(1, ContextCompat.getDrawable(context, R.drawable.slider3)))
        add(BookingAddressUiModel(2, ContextCompat.getDrawable(context, R.drawable.slider4)))
    }