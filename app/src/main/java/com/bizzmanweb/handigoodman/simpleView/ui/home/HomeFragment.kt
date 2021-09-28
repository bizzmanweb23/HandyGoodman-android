package com.bizzmanweb.handigoodman.simpleView.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bizzmanweb.handigoodman.base.BaseFragment
import com.bizzmanweb.handigoodman.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override fun getLayout(inflater: LayoutInflater, container: ViewGroup?): FragmentHomeBinding =
        FragmentHomeBinding.inflate(
            inflater,
            container,
            false
        )

    override fun setUp() {

        binding.headerLayout.listener = this
    }

}