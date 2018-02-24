package com.tuvy.tomosugi.flexiblekeyboard.entity

import android.graphics.Point
import android.util.Log

data class Finger(val point: Point) {

    fun toPoint(data: String): Point {
        val str = data.substring(5, data.length)
        Log.d("DataFinger", str)
        return Point(0, 0)
    }
}