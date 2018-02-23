package com.tuvy.tomosugi.flexiblekeyboard.presentation

import android.animation.ArgbEvaluator
import android.animation.ValueAnimator
import android.graphics.Color
import com.tuvy.tomosugi.flexiblekeyboard.misc.ViewModel

class SetupHomePositionViewModel(private val preference: Preference) : ViewModel {

    private var start: Long = 0
    private var end: Long = 0
    val colorAnimator = ValueAnimator.ofObject(ArgbEvaluator(), Color.WHITE, Color.GREEN)
            .apply { this.duration = 5000 }

    override fun onCreate() {
    }

    override fun onBind() {
    }

    override fun onDestroy() {
    }

    fun onTouchDown() {
        preference.setExperienceToTouch(true)
        start = System.currentTimeMillis()
        colorAnimator.start()
    }

    fun onTouchUp() {
        preference.setExperienceToTouch(false)
        end = System.currentTimeMillis()
        if ((end - start) >= 5000) {
            // 5秒たったときの処理
        } else {
            colorAnimator.reverse()
        }
    }
}