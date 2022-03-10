package com.bizzmanweb.handigoodman.base

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.viewpager2.widget.ViewPager2
import com.bizzmanweb.handigoodman.R
import java.util.*
import kotlin.collections.ArrayList

class CreateViewPagerDot(
    private val context: Context,
    private val linearLayout: LinearLayoutCompat,
    private val totalPages: Int,
    private val viewpager: ViewPager2,
    private val autoSlide: Boolean = false,
    private val gravity: Int = Gravity.START
) {

    private var currentPage = 0

    private val dots = ArrayList<ImageView>()

    var NEXT_SCHEDULE_TIME: Long = 5000

    init {
        addBottomDots(
            viewpager,
            linearLayout,
            totalPages,
            autoSlide
        )
    }

    fun addBottomDots(
        viewPager: ViewPager2,
        layoutDots: LinearLayoutCompat,
        totalPages: Int,
        autoSlide: Boolean = false
    ) {

        layoutDots.removeAllViews()
        layoutDots.gravity = gravity
        for (i in 0 until totalPages) {
            val dot = ImageView(context)
            val layoutParams = LinearLayout.LayoutParams(35, 35)
            layoutParams.apply {
                setMargins(10, 0, 0, 10)
            }

            // dot create
            dot.apply {
                this.layoutParams = layoutParams
                setImageResource(R.drawable.bg_input)
                setPadding(6, 6, 6, 6)
            }.also {
                dots.add(it)
                layoutDots.addView(it)
            }
        }

        // Apply dot change accordingly page change

        dotChangeAccordingToSlideing(viewPager = viewPager, autoSliding = autoSlide)
    }


    private fun dotChangeAccordingToSlideing(viewPager: ViewPager2, autoSliding: Boolean = false) {

        autoPageChange(viewPager, autoSliding)

    }

    private fun autoPageChange(viewPager: ViewPager2, boolean: Boolean) {

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)

                currentPage = position

                if (boolean) {
                    val handler = Handler(Looper.getMainLooper())
                    val update = Runnable {
                        currentPage++
                        if (dots.size == currentPage) {
                            currentPage = 0
                        }
                        viewPager.setCurrentItem(currentPage, true)
                    }

                    Timer().schedule(
                        object : TimerTask() {
                            override fun run() {
                                handler.post(update)
                            }

                        }, NEXT_SCHEDULE_TIME
                    )
                }

                selectedDot(position)
            }


            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)

                currentPage = position
            }

        })
    }

    private fun selectedDot(pos: Int) {

        dots.forEachIndexed { index, imageView ->
            imageView.setImageResource(R.drawable.bg_input)
            if (pos == index) {
                imageView.setImageResource(R.drawable.bg_little_rounded_corner)
            }
        }
    }
}