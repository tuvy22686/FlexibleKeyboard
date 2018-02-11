package com.tuvy.tomosugi.flexiblekeyboard.dialog

import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v7.app.AlertDialog
import android.view.WindowManager

class DescriptionDialog : DialogFragment() {

    companion object {
        val TAG = DescriptionDialog::class.java.simpleName
        val ARG_TITLE = "ARG_TITLE"
        val ARG_MESSAGE = "ARG_MESSAGE"

        fun getInstance(title: String, message: String): DescriptionDialog {
            return DescriptionDialog().apply {
                arguments = Bundle().apply {
                    putString(ARG_TITLE, title)
                    putString(ARG_MESSAGE, message)
                }
            }
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        super.onCreateDialog(savedInstanceState)
        val title: String = arguments.getString(ARG_TITLE)
        val message: String = arguments.getString(ARG_MESSAGE)
        val positive: String? = "OK"

        return AlertDialog.Builder(context).apply {
            setTitle(title)
            setMessage(message)
            setPositiveButton(positive, null)
        }.create()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setupWindowFocusable()
    }

    override fun onPause() {
        super.onPause()
        dismiss()
    }

    private fun setupWindowFocusable() {
        val window = dialog.window
        window.addFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE)
    }
}