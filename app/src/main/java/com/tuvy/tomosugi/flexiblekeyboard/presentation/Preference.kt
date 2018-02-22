package com.tuvy.tomosugi.flexiblekeyboard.presentation

import android.content.Context
import android.preference.PreferenceManager

class Preference(context: Context) {

    private val preference = PreferenceManager.getDefaultSharedPreferences(context)

    private val PREFIX = context.packageName + '.'
    private val EXPERIENCE_TO_TOUCH = PREFIX + "experience_to_touch"

    fun clear() {
        preference.edit().clear().apply()
    }

    fun setExperienceToTouch(flag: Boolean) {
        preference.edit().putBoolean(EXPERIENCE_TO_TOUCH, flag).apply()
    }

    fun getExprienceToTouch(): Boolean {
        return preference.getBoolean(EXPERIENCE_TO_TOUCH, false)
    }

    fun setInitializeHomePosition(flag: Boolean) {
    }
}