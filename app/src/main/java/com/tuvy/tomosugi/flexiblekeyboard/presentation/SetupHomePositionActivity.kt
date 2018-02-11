package com.tuvy.tomosugi.flexiblekeyboard.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import com.tuvy.tomosugi.flexiblekeyboard.databinding.ActivitySetupHomePositionBinding
import com.tuvy.tomosugi.flexiblekeyboard.dialog.DescriptionDialog
import com.tuvy.tomosugi.flexiblekeyboard.misc.BaseActivity

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

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        super.onTouchEvent(event)
        event?.let {
            if (it.action == MotionEvent.ACTION_DOWN) {
                binding.textView.visibility = View.GONE
            }
            if (it.action == MotionEvent.ACTION_UP) {
                binding.textView.visibility = View.VISIBLE
                Log.d("onTouchEvent", "count: " + it.pointerCount.toString())
                Log.d("onTouchEvent", it.x.toString() + ", " + it.y.toString())
            }
        }
        return true
    }
}