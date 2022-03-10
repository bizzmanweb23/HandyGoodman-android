package com.bizzmanweb.handigoodman.base

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding> : Fragment(),
    BackClickListener {

    protected lateinit var binding: VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = getLayout(
            inflater, container
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUp()
    }

    abstract fun getLayout(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): VB

    abstract fun setUp()


    override fun backBtnClick() {
       activity?.onBackPressed()
    }
}