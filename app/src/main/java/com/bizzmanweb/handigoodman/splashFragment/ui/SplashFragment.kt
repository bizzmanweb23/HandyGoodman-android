package com.bizzmanweb.handigoodman.splashFragment.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bizzmanweb.handigoodman.R
import com.bizzmanweb.handigoodman.base.BaseFragment
import com.bizzmanweb.handigoodman.databinding.FragmentSplashBinding

class SplashFragment : BaseFragment<FragmentSplashBinding>(),
    SplashFragmentClickListener {

    override fun getLayout(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSplashBinding =
        FragmentSplashBinding.inflate(inflater, container, false)

    override fun setUp() {

        binding.listener = this
    }

    override fun onGetStartedClick() {
       findNavController().navigate(
           R.id.action_splashFragment_to_viewOptionFragment
       )
    }
}