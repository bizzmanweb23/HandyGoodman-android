package com.bizzmanweb.handigoodman.simpleView

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.bizzmanweb.handigoodman.R
import com.bizzmanweb.handigoodman.databinding.ActivitySimpleViewBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class SimpleViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySimpleViewBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySimpleViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        navController =
            Navigation.findNavController(this, R.id.nav_host_fragment_activity_simple_view)
        NavigationUI.setupWithNavController(navView, navController)
        binding.navView.setupWithNavController(navController)
    }

}