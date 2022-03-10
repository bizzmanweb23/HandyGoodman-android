package com.bizzmanweb.handigoodman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.ui.BookingAddressImageSliderAdapter


class RegisterActivity : AppCompatActivity() {

    private lateinit var imageSliderAdapter: BookingAddressImageSliderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initAdapter()

    }

    private fun initAdapter() {
        imageSliderAdapter = BookingAddressImageSliderAdapter()

    }
}