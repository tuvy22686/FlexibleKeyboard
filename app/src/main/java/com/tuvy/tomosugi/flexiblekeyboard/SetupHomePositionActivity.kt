package com.tuvy.tomosugi.flexiblekeyboard

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tuvy.tomosugi.flexiblekeyboard.databinding.ActivitySetupHomePositionBinding

class SetupHomePositionActivity : AppCompatActivity() {

    companion object {
        fun createIntent(context: Context): Intent {
            return Intent(context, SetupHomePositionActivity::class.java)
        }
    }

    private val binding: ActivitySetupHomePositionBinding by lazy {
        ActivitySetupHomePositionBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}