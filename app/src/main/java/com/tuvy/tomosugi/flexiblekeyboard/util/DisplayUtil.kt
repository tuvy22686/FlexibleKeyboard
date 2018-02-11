package com.tuvy.tomosugi.flexiblekeyboard.util

import android.app.Activity
import android.graphics.Point

object DisplayUtil {

    fun getDisplaySize(activity: Activity): Point {
        val display = activity.windowManager.defaultDisplay
        val point = Point()
        display.getSize(point)
        return point
    }
}