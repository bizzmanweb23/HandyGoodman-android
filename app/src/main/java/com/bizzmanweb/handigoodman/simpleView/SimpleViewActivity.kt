package com.bizzmanweb.handigoodman.simpleView

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.bizzmanweb.handigoodman.R
import com.bizzmanweb.handigoodman.databinding.ActivitySimpleViewBinding

class SimpleViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySimpleViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySimpleViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_simple_view)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
       // NavigationUI.setupActionBarWithNavController(this, navController)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_calendar,
                R.id.navigation_profile
            )
        )
        //setupActionBarWithNavController(navController, appBarConfiguration)
       // navView.setupWithNavController(navController)
    }
}