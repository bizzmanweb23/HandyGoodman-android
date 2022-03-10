package com.bizzmanweb.handigoodman.optimizeView.ui.bookingDateTime

import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bizzmanweb.handigoodman.base.BaseFragment
import com.bizzmanweb.handigoodman.base.CreateViewPagerDot
import com.bizzmanweb.handigoodman.databinding.FragmentSelectDateTimeBinding
import com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.model.getSliderImages
import com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.ui.BookingAddressImageSliderAdapter

class BookingDateTimeFragment : BaseFragment<FragmentSelectDateTimeBinding>() {

    private lateinit var imageSliderAdapter: BookingAddressImageSliderAdapter
    private lateinit var doorAdapter: SingleTextViewAdapter
    private lateinit var selectTimeAdapter: SingleTextViewAdapter
    private lateinit var appointmentDateAdapter: AppointmentDateAdapter

    override fun getLayout(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSelectDateTimeBinding = FragmentSelectDateTimeBinding.inflate(
        inflater,
        container,
        false
    )

    override fun setUp() {

        initAdapters()

        // SET UP HEADER
        binding.apply {
            headerLayout.listener = this@BookingDateTimeFragment
            headerLayout.pageTitle.text = "DOOR REPEAIR"
        }

        binding.apply {
            //  SET UP IMAGE SLIDER
            viewPager2.adapter = imageSliderAdapter
            imageSliderAdapter.submitList(getSliderImages(requireContext()))

            CreateViewPagerDot(
                context = requireContext(),
                linearLayout = linearLayoutCompat,
                totalPages = imageSliderAdapter.itemCount,
                gravity = Gravity.CENTER,
                viewpager = viewPager2
            )

            // SETUP Door LIST
            appartmentDoorRV.apply {
                val arr = mutableListOf<String>()
                (1..20).forEach {
                    arr.add(it.toString())
                }
                adapter = doorAdapter
                doorAdapter.submitList(
                    arr
                )
            }


            // SETUP APPOINTMENT DATE LIST

            selectDateRv.apply {

                val arr = mutableListOf<String>()
                (1..20).forEach {
                    arr.add("Jan \n $it")
                }
                adapter = appointmentDateAdapter
                appointmentDateAdapter.submitList(arr)
            }

            // SETUP Door LIST
            selectTimeRv.apply {
                val arr = mutableListOf<String>()
                (6..20).forEach {
                    val time: String = if (it<12){
                         "a.m"
                    }else{
                        "P.m"
                    }
                    arr.add(it.toString() + time)
                }
                adapter = selectTimeAdapter
                selectTimeAdapter.submitList(
                    arr
                )
            }

        }
    }


    private fun initAdapters() {
        imageSliderAdapter = BookingAddressImageSliderAdapter()
        doorAdapter = SingleTextViewAdapter()
        selectTimeAdapter = SingleTextViewAdapter()
        appointmentDateAdapter = AppointmentDateAdapter()
    }
}