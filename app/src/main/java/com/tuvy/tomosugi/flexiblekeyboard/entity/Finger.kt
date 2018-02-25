package com.tuvy.tomosugi.flexiblekeyboard.entity

import android.graphics.Point
import com.tuvy.tomosugi.flexiblekeyboard.Constant

data class Finger(
        val fingerType: FingerType,
        val point: Point) {

    enum class FingerType(val id: Int) {
        Thumb(id = Constant.Hand.THUMB_ID),
        IndexFinger(id = Constant.Hand.INDEX_FINGER_ID),
        MiddleFinger(id = Constant.Hand.MIDDLE_FINGER_ID),
        RingFinger(id = Constant.Hand.RING_FINGER_ID),
        LittleFinger(id = Constant.Hand.LITTLE_FINGER_ID);
    }
}