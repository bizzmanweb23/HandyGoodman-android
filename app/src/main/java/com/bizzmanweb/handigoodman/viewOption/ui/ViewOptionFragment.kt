package com.bizzmanweb.handigoodman.viewOption.ui

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bizzmanweb.handigoodman.base.BaseFragment
import com.bizzmanweb.handigoodman.databinding.FragmentViewOptionBinding
import com.bizzmanweb.handigoodman.optimizeView.OptimizeViewActivity
import com.bizzmanweb.handigoodman.simpleView.SimpleViewActivity

class ViewOptionFragment : BaseFragment<FragmentViewOptionBinding>(),
    ViewOptionFragmentClickListener{
    override fun getLayout(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentViewOptionBinding = FragmentViewOptionBinding.inflate(
        inflater,
        container,
        false
    )

    override fun setUp() {

        binding.listener = this
    }

    override fun onSimpleViewBtnClicked() {

        startActivity(
            Intent(requireActivity(), SimpleViewActivity::class.java)
        )
    }

    override fun onOptimizeViewBtnClicked() {
        startActivity(
            Intent(requireActivity(), OptimizeViewActivity::class.java)
        )
    }
}