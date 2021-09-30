package com.bizzmanweb.handigoodman.thank_you

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bizzmanweb.handigoodman.base.BaseFragment
import com.bizzmanweb.handigoodman.databinding.FragmentThankYouBinding

class ThankYouFragment: BaseFragment<FragmentThankYouBinding>() {

    override fun getLayout(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentThankYouBinding = FragmentThankYouBinding.inflate(
        inflater,
        container,
        false
    )

    override fun setUp() {

    }
}