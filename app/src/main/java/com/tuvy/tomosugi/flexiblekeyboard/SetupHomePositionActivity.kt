package com.tuvy.tomosugi.flexiblekeyboard

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.tuvy.tomosugi.flexiblekeyboard.databinding.ActivitySetupHomePositionBinding
import com.tuvy.tomosugi.flexiblekeyboard.dialog.DescriptionDialog

class SetupHomePositionActivity : BaseActivity() {

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
        setupDialog()
    }

    private fun setupDialog() {
        DescriptionDialog.getInstance("title", "message")
                .show(supportFragmentManager, DescriptionDialog.TAG)
    }
}