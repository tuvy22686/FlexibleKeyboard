package com.tuvy.tomosugi.flexiblekeyboard.presentation

import android.animation.ArgbEvaluator
import android.animation.ValueAnimator
import android.graphics.Color
import com.tuvy.tomosugi.flexiblekeyboard.Constant
import com.tuvy.tomosugi.flexiblekeyboard.misc.ViewModel

class SetupHomePositionViewModel(private val preference: Preference) : ViewModel {

    private var beginToPress: Long = 0
    private var endToPress: Long = 0
    val colorAnimator = ValueAnimator.ofObject(ArgbEvaluator(), Color.WHITE, Color.GREEN)
            .apply { this.duration = Constant.Setup.HOLDING_TIME }

    override fun onCreate() {
    }

    override fun onBind() {
    }

    override fun onDestroy() {
    }

    fun onTouchDown() {
        preference.setExperienceToTouch(true)
        beginToPress = System.currentTimeMillis()
        colorAnimator.start()
    }

    fun onTouchUp() {
        preference.setExperienceToTouch(false)
        endToPress = System.currentTimeMillis()
        if ((endToPress - beginToPress) >= Constant.Setup.HOLDING_TIME) {
            // 5秒たったときの処理
        } else {
            colorAnimator.reverse()
        }
    }
}