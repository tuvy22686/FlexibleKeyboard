package com.tuvy.tomosugi.flexiblekeyboard.application

import android.content.Context
import android.preference.PreferenceManager

class Preference(context: Context) {

    private val preference = PreferenceManager.getDefaultSharedPreferences(context)

    private val PREFIX = context.packageName + '.'
    private val DISPLAY_SIZE_HEIGHT = PREFIX + "display_size_height"
    private val DISPLAY_SIZE_WIDTH = PREFIX + "display_size_width"
    private val EXP_TO_TOUCH_FIVE = PREFIX + "exp_to_touch_five"

    fun clear() {
        preference.edit().clear().apply()
    }

    fun setDisplaySizeHeight(height: Int) {
        preference.edit().putInt(DISPLAY_SIZE_HEIGHT, height).apply()
    }

    fun getDisplaySizeHeight(): Int {
        return preference.getInt(DISPLAY_SIZE_HEIGHT, 0)
    }

    fun setDisplaySizeWidth(width: Int) {
        preference.edit().putInt(DISPLAY_SIZE_WIDTH, width).apply()
    }

    fun getDisplaySizeWidth(): Int {
        return preference.getInt(DISPLAY_SIZE_WIDTH, 0)
    }

    fun setExpToTouchFive(flag: Boolean) {
        preference.edit().putBoolean(EXP_TO_TOUCH_FIVE, flag).apply()
    }

    fun getExpToTouchFive(): Boolean {
        return preference.getBoolean(EXP_TO_TOUCH_FIVE, false)
    }
}