package com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bizzmanweb.handigoodman.base.BaseFragment
import com.bizzmanweb.handigoodman.databinding.FragmentBookingAddressBinding

class BookingAddressFragment: BaseFragment<FragmentBookingAddressBinding>() {
    override fun getLayout(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentBookingAddressBinding = FragmentBookingAddressBinding.inflate(
        inflater,
        container,
        false
    )

    override fun setUp() {

        binding.smallHeaderLayout.listener = this
    }
}