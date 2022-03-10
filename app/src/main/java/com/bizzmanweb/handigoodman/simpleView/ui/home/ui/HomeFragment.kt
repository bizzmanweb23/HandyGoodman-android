package com.bizzmanweb.handigoodman.simpleView.ui.home.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bizzmanweb.handigoodman.base.BaseFragment
import com.bizzmanweb.handigoodman.base.RecycleViewItemClickListener
import com.bizzmanweb.handigoodman.databinding.FragmentHomeBinding
import com.bizzmanweb.handigoodman.simpleView.ui.home.model.ServiceUiModel
import com.bizzmanweb.handigoodman.simpleView.ui.home.model.getServices
import kotlin.math.log

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    private lateinit var serviceAdapter: SimpleViewServiceAdapter

    override fun getLayout(inflater: LayoutInflater, container: ViewGroup?): FragmentHomeBinding =
        FragmentHomeBinding.inflate(
            inflater,
            container,
            false
        )

    override fun setUp() {

        // ADD BACK LISTENER
        binding.headerLayout.listener = this

        //  APPLY SERVICES RECYCLER VIEW
        initAdapter()
        binding.apply {
            serviceRV.adapter = serviceAdapter
            serviceAdapter.submitList(getServices(requireContext()))
        }
    }

    private fun initAdapter(){
        serviceAdapter = SimpleViewServiceAdapter()
        serviceAdapter.setListener(object : RecycleViewItemClickListener<ServiceUiModel>{
            override fun onItemClick(item: ServiceUiModel) {
                findNavController().navigate(
                    HomeFragmentDirections.actionNavigationHomeToBookingAddressFragment()
                )
            }

        })
    }


}