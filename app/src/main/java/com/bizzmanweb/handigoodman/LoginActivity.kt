package com.bizzmanweb.handigoodman

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.bizzmanweb.handigoodman.base.BaseFragment
import com.bizzmanweb.handigoodman.base.CreateViewPagerDot
import com.bizzmanweb.handigoodman.databinding.ActivityLoginBinding
import com.bizzmanweb.handigoodman.databinding.ActivitySimpleViewBinding
import com.bizzmanweb.handigoodman.databinding.FragmentThankYouBinding
import com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.model.getSliderImages
import com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.ui.BookingAddressFragment
import com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.ui.BookingAddressFragmentDirections
import com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.ui.BookingAddressImageSliderAdapter
import com.bizzmanweb.handigoodman.simpleView.ui.bookingAddress.ui.BookingAddressPageClickListener

class LoginActivity : AppCompatActivity(), BookingAddressPageClickListener {
    private lateinit var binding: ActivityLoginBinding

    private lateinit var imageSliderAdapter: BookingAddressImageSliderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        imageSliderAdapter = BookingAddressImageSliderAdapter()
        binding.also {
            it.listener=this
            it.viewPager2.apply {
                adapter = imageSliderAdapter
                imageSliderAdapter.submitList(getSliderImages(this@LoginActivity))
            }
            CreateViewPagerDot(this, binding.dotsLayout, 3, binding.viewPager2)
        }
        with(binding)
        {
            submitBtn.setOnClickListener(){
                login()
            }
        }
    }

    private fun login() {
        startActivity(Intent(this, LoginActivity::class.java))
    }

    override fun onSubmitBtnClick() {

    }

    override fun loginHere() {
    }
}