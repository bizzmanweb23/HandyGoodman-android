package com.bizzmanweb.handigoodman.optimizeView.ui.subFreature

import android.text.Layout
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.bizzmanweb.handigoodman.base.BaseFragment
import com.bizzmanweb.handigoodman.base.CreateViewPagerDot
import com.bizzmanweb.handigoodman.base.RecycleViewItemClickListener
import com.bizzmanweb.handigoodman.databinding.FragmentOptionViewSubFeatureBinding
import com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.model.getSliderImages
import com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.ui.BookingAddressImageSliderAdapter
import com.bizzmanweb.handigoodman.simpleView.ui.home.model.ServiceUiModel
import com.bizzmanweb.handigoodman.simpleView.ui.home.model.getServices

class SubFeatureFragment : BaseFragment<FragmentOptionViewSubFeatureBinding>() {

    private lateinit var imageSliderAdapter: BookingAddressImageSliderAdapter
    private lateinit var featureAdapter: SubFeatureAdapter

    override fun getLayout(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentOptionViewSubFeatureBinding = FragmentOptionViewSubFeatureBinding.inflate(
        inflater,
        container,
        false
    )

    override fun setUp() {

        init()

        binding.apply {
            // SET BACK CLICK LISTENER
            include.listener = this@SubFeatureFragment
            include.pageTitle.text = "DOOR REPAIR"

            // SET IMAGE SLIDER
            viewPager.adapter = imageSliderAdapter
            imageSliderAdapter.submitList(getSliderImages(requireContext()))
            CreateViewPagerDot(
                context= requireContext(),
                linearLayout =  dotLayout,
                totalPages = imageSliderAdapter.itemCount,
                viewpager =  viewPager,
                gravity = Gravity.START
            )

            // SET FEATURE LIST

            recyclerView.apply {
                adapter = featureAdapter
                featureAdapter.submitList(getServices(requireContext()))

                featureAdapter.setListener(object : RecycleViewItemClickListener<ServiceUiModel>{
                    override fun onItemClick(item: ServiceUiModel) {
                        findNavController().navigate(
                            SubFeatureFragmentDirections.actionSubFeatureFragmentToBookingDateTimeFragment()
                        )
                    }

                })
            }

        }
    }

    private fun init(){
        imageSliderAdapter = BookingAddressImageSliderAdapter()
        featureAdapter = SubFeatureAdapter()
    }
}