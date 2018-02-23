package com.tuvy.tomosugi.flexiblekeyboard.presentation

import android.content.Context
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import com.tuvy.tomosugi.flexiblekeyboard.databinding.ActivitySetupHomePositionBinding
import com.tuvy.tomosugi.flexiblekeyboard.dialog.DescriptionDialog
import com.tuvy.tomosugi.flexiblekeyboard.misc.BaseActivity
import com.tuvy.tomosugi.flexiblekeyboard.util.DisplayUtil

class SetupHomePositionActivity : BaseActivity() {

    companion object {
        fun createIntent(context: Context): Intent {
            return Intent(context, SetupHomePositionActivity::class.java)
        }
    }

    private val binding: ActivitySetupHomePositionBinding by lazy {
        ActivitySetupHomePositionBinding.inflate(layoutInflater)
    }

    private val setupHomePositionViewModel : SetupHomePositionViewModel by lazy {
        SetupHomePositionViewModel(Preference(this))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupHomePositionViewModel.onCreate()
        setupDialog()
        setupBackgroundColor()

        Log.d("displaySize", "display size: " + DisplayUtil.getDisplaySize(this))
        setupHomePositionViewModel.onBind()
    }

    override fun onDestroy() {
        super.onDestroy()
        setupHomePositionViewModel.onDestroy()
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        super.onTouchEvent(event)
        event?.let {
            when (it.action) {
                MotionEvent.ACTION_DOWN -> setupHomePositionViewModel.onTouchDown()
                MotionEvent.ACTION_UP -> setupHomePositionViewModel.onTouchUp()
            }
        }
        return true
    }

    private fun setupDialog() {
        DescriptionDialog.getInstance("title", "message")
                .show(supportFragmentManager, DescriptionDialog.TAG)
    }

    private fun setupBackgroundColor() {
        setupHomePositionViewModel.colorAnimator.addUpdateListener {
            val colorCode = it.animatedValue as Int
            binding.parentLayout.background = ColorDrawable(colorCode)
        }
    }
}