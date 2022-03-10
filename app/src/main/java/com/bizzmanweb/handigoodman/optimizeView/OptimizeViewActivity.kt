package com.bizzmanweb.handigoodman.optimizeView

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.bizzmanweb.handigoodman.R
import com.bizzmanweb.handigoodman.databinding.ActivityOptimizeViewBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class OptimizeViewActivity: AppCompatActivity() {

    private lateinit var binding: ActivityOptimizeViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOptimizeViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController =
            Navigation.findNavController(this, R.id.nav_host_fragment_activity_optimize_view)
        NavigationUI.setupWithNavController(navView, navController)
        binding.navView.setupWithNavController(navController)
    }
}