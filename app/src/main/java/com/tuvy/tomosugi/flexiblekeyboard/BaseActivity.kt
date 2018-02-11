package com.tuvy.tomosugi.flexiblekeyboard

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupHideNavigationBar()
    }

    private fun setupHideNavigationBar() {
        val decor = this.window.decorView
        decor.systemUiVisibility= (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_IMMERSIVE
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)
    }
}