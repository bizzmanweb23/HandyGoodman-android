package com.bizzmanweb.handigoodman.optimizeView.ui.optimizeHome

import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bizzmanweb.handigoodman.base.BaseFragment
import com.bizzmanweb.handigoodman.base.CreateViewPagerDot
import com.bizzmanweb.handigoodman.databinding.FragmentOptimizeHomeBinding
import com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.model.getSliderImages
import com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.ui.BookingAddressImageSliderAdapter

class OptimizeHomeFragment : BaseFragment<FragmentOptimizeHomeBinding>(),
    ServiceChooseListener{

    private lateinit var offerAdapter: OptimizeHomeOfferAdapter
    private lateinit var sliderAdapter: BookingAddressImageSliderAdapter

    override fun getLayout(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentOptimizeHomeBinding = FragmentOptimizeHomeBinding.inflate(
        inflater,
        container,
        false
    )

    override fun setUp() {

        initSliderAdapter()
        initOfferAdapter()

        binding.apply {
            offerLayout.also {
                it.offerRV.adapter = offerAdapter
                offerAdapter.submitList(getOffers(requireContext()))
            }

            viewPager.apply {
                adapter = sliderAdapter
                sliderAdapter.submitList(getSliderImages(requireContext()))
                CreateViewPagerDot(
                    context = requireContext(),
                    linearLayout = layoutDots,
                    totalPages = sliderAdapter.itemCount,
                    viewpager = viewPager,
                    gravity = Gravity.CENTER
                )
            }

            // SET SERVICE CHOOSE LISTENER
            optimizeViewServiceLayout.listener = this@OptimizeHomeFragment
        }
    }

    private fun initOfferAdapter() {
        offerAdapter = OptimizeHomeOfferAdapter()
    }

    private fun initSliderAdapter() {
        sliderAdapter = BookingAddressImageSliderAdapter()
    }

    override fun onServiceClick() {
        findNavController().navigate(
            OptimizeHomeFragmentDirections.actionOptimizeHomeFragmentToSubFeatureFragment()
        )
    }
}