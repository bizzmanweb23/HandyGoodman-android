package com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bizzmanweb.handigoodman.LoginActivity
import com.bizzmanweb.handigoodman.base.BaseFragment
import com.bizzmanweb.handigoodman.base.CreateViewPagerDot
import com.bizzmanweb.handigoodman.databinding.FragmentBookingAddressBinding
import com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.model.getSliderImages
import com.bizzmanweb.handigoodman.simpleView.ui.login.LogInFragment

class BookingAddressFragment : BaseFragment<FragmentBookingAddressBinding>(),
    BookingAddressPageClickListener {

    private lateinit var imageSliderAdapter: BookingAddressImageSliderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initAdapter()
    }

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
        binding.also {
            it.listener = this
            it.viewPager.apply {
                adapter = imageSliderAdapter
                imageSliderAdapter.submitList(getSliderImages(requireContext()))
            }
            CreateViewPagerDot(requireContext(), binding.dotsLayout, 3, binding.viewPager)
        }
    }

    override fun onSubmitBtnClick() {
        findNavController().navigate(
            BookingAddressFragmentDirections.actionBookingAddressFragmentToThankYouFragment()
        )
    }

    override fun loginHere() {
        findNavController().navigate(
            BookingAddressFragmentDirections.actionBookingAddressFragmentToLoginFragment()
        )
    }

    private fun initAdapter() {
        imageSliderAdapter = BookingAddressImageSliderAdapter()

    }
}