package com.tuvy.tomosugi.flexiblekeyboard.presentation

import android.content.Context
import android.preference.PreferenceManager

class Preference(context: Context) {

    private val preference = PreferenceManager.getDefaultSharedPreferences(context)

    private val PREFIX = context.packageName + '.'
    private val DISPLAY_SIZE_HEIGHT = PREFIX + "display_size_height"
    private val DISPLAY_SIZE_WIDTH = PREFIX + "display_size_width"
    private val EXPERIENCE_TO_TOUCH = PREFIX + "experience_to_touch"

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

    fun setExperienceToTouch(flag: Boolean) {
        preference.edit().putBoolean(EXPERIENCE_TO_TOUCH, flag).apply()
    }

    fun getExprienceToTouch(): Boolean {
        return preference.getBoolean(EXPERIENCE_TO_TOUCH, false)
    }
}