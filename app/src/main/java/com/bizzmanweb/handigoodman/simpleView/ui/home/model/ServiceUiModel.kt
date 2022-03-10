package com.bizzmanweb.handigoodman.simpleView.ui.home.model

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.bizzmanweb.handigoodman.R

data class ServiceUiModel(
    val id: Int,
    val name: String,
    val image: Drawable?
)

fun getServices(context: Context)=
    mutableListOf<ServiceUiModel>().apply {
        add(ServiceUiModel(id = 0, name = "Door Lock Replacement", image = ContextCompat.getDrawable(context, R.drawable.door_lock_1)))
        add(ServiceUiModel(id = 1, name = "Get Lock", image = ContextCompat.getDrawable(context,
            R.drawable.cabinet_hinge_1
        )))
        add(ServiceUiModel(id = 2, name = "Door Lock", image = ContextCompat.getDrawable(context,
            R.drawable.hang_mirror_11
        )))
        add(ServiceUiModel(id = 3, name = "Door Lock", image = ContextCompat.getDrawable(context,
            R.drawable.getlock_2_1
        )))
        add(ServiceUiModel(id = 4, name = "Door Lock", image = ContextCompat.getDrawable(context,
            R.drawable.table_chair_assaimble
        )))
        add(ServiceUiModel(id = 5, name = "Door Lock", image = ContextCompat.getDrawable(context,
            R.drawable.hang_mirror_20
        )))
        add(ServiceUiModel(id = 6, name = "Door Lock", image = ContextCompat.getDrawable(context,
            R.drawable.hang_mirror_16
        )))
        add(ServiceUiModel(id = 7, name = "Door Lock", image = ContextCompat.getDrawable(context, R.drawable.hang_mirror_17)))
        add(ServiceUiModel(id = 8, name = "Door Lock", image = ContextCompat.getDrawable(context, R.drawable.hang_mirror_18)))
        add(ServiceUiModel(id = 9, name = "Door Lock", image = ContextCompat.getDrawable(context, R.drawable.hang_mirror_19)))
        add(ServiceUiModel(id = 10, name = "Door Lock", image = ContextCompat.getDrawable(context, R.drawable.hang_mirror_20)))
        add(ServiceUiModel(id = 11, name = "Door Lock", image = ContextCompat.getDrawable(context, R.drawable.hang_mirror_21)))
        add(ServiceUiModel(id = 12, name = "Door Lock", image = ContextCompat.getDrawable(context, R.drawable.hang_mirror_22)))
        add(ServiceUiModel(id = 13, name = "Door Lock", image = ContextCompat.getDrawable(context, R.drawable.hang_mirror_17)))
        add(ServiceUiModel(id = 14, name = "Door Lock", image = ContextCompat.getDrawable(context, R.drawable.hang_mirror_15)))
        add(ServiceUiModel(id = 15, name = "Door Lock", image = ContextCompat.getDrawable(context, R.drawable.hang_mirror_1)))
    }
