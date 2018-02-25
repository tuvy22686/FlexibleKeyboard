package com.tuvy.tomosugi.flexiblekeyboard.presentation

import android.animation.ArgbEvaluator
import android.animation.ValueAnimator
import android.graphics.Color
import android.util.Log
import android.view.MotionEvent
import com.tuvy.tomosugi.flexiblekeyboard.Constant
import com.tuvy.tomosugi.flexiblekeyboard.application.Preference
import com.tuvy.tomosugi.flexiblekeyboard.misc.ViewModel

class SetupHomePositionViewModel(private val preference: Preference) : ViewModel {

    private var beginToPress: Long = 0
    private var endToPress: Long = 0
    val colorAnimator = ValueAnimator.ofObject(ArgbEvaluator(), Color.WHITE, Color.GREEN)!!
            .apply { this.duration = Constant.Setup.HOLDING_TIME }

    override fun onCreate() {
    }

    override fun onBind() {
    }

    override fun onDestroy() {
    }

    fun onTouchScreen(event: MotionEvent): Boolean {
        if (touchWithFiveFingers(event) && !preference.getExpToTouchFive()) {
            preference.setExpToTouchFive(true)
            startInitialization()
        }
        if (MotionEvent.ACTION_POINTER_UP == event.actionMasked) {
            return touchUpScreen(event)
        }
        return false
    }

    private fun startInitialization() {
        beginToPress = System.currentTimeMillis()
        colorAnimator.start()
    }

    private fun touchUpScreen(event: MotionEvent): Boolean {
        endToPress = System.currentTimeMillis()
        if (preference.getExpToTouchFive()) {
            if ((endToPress - beginToPress) >= Constant.Setup.HOLDING_TIME) {
                // 5秒たったときの処理
                Log.d("Setup", "went to 5 seconds")
                return true
            } else {
                preference.setExpToTouchFive(false)
                colorAnimator.reverse()
            }
        }
        return false
    }

    private fun touchWithFiveFingers(event: MotionEvent): Boolean {
        return (event.pointerCount == Constant.Hand.NUMBER_OF_FINGERS)
    }
}