package com.tuvy.tomosugi.flexiblekeyboard.presentation

import com.tuvy.tomosugi.flexiblekeyboard.misc.ViewModel

class SetupHomePositionViewModel(private val preference: Preference) : ViewModel {

    private var start: Long = 0
    private var end: Long = 0


    override fun onCreate() {
    }

    override fun onBind() {
    }

    override fun onDestroy() {
    }

    fun onTouchDown() {
        preference.setExperienceToTouch(true)
        start = System.currentTimeMillis()
    }

    fun onTouchUp() {
        preference.setExperienceToTouch(false)
        end = System.currentTimeMillis()
        if ((end - start) >= 5000) {
            // 5秒以上経った時の処理
        }
    }
}