package com.bizzmanweb.handigoodman.simpleView.ui.login

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bizzmanweb.handigoodman.R
import com.bizzmanweb.handigoodman.base.BaseFragment
import com.bizzmanweb.handigoodman.base.CreateViewPagerDot
import com.bizzmanweb.handigoodman.databinding.LogInFragmentBinding
import com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.model.getSliderImages
import com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.ui.BookingAddressImageSliderAdapter

class LogInFragment : BaseFragment<LogInFragmentBinding>(),
LoginPageClickListener{
    private lateinit var imageSliderAdapter: BookingAddressImageSliderAdapter
    companion object {
        fun newInstance() = LogInFragment()
    }

    private lateinit var viewModel: LogInViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initAdapter()
    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(LogInViewModel::class.java)
//        // TODO: Use the ViewModel
//    }


    override fun getLayout(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): LogInFragmentBinding = LogInFragmentBinding.inflate(
        inflater,
        container,
        false
    )

    override fun setUp() {
        binding.smallHeaderLayout.listener = this
        binding.also {
            it.login = this
            it.viewPagerLogin.apply {
                adapter = imageSliderAdapter
                imageSliderAdapter.submitList(getSliderImages(requireContext()))
            }
            CreateViewPagerDot(requireContext(), binding.dotsLayout, 3, binding.viewPagerLogin)
        }
    }

    override fun onLogin() {
        findNavController().navigate(
            LogInFragmentDirections.actionBookingAddressFragmentToThankYouFragment()
        )
    }
    private fun initAdapter() {
        imageSliderAdapter = BookingAddressImageSliderAdapter()

    }
}