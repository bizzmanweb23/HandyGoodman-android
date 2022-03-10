package com.bizzmanweb.handigoodman.optimizeView.ui.optimizeHome

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.bizzmanweb.handigoodman.R

data class OfferModel(
    val id: Int,
    val image: Drawable?
)

fun getOffers(context: Context) = mutableListOf<OfferModel>().apply {
    add(OfferModel(0, ContextCompat.getDrawable(context, R.drawable.offer1)))
    add(OfferModel(1, ContextCompat.getDrawable(context, R.drawable.offer2)))
    add(OfferModel(2, ContextCompat.getDrawable(context, R.drawable.offer1)))
}