package com.tuvy.tomosugi.flexiblekeyboard

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tuvy.tomosugi.flexiblekeyboard.databinding.FragmentTutorialStartBinding

class TutorialStartFragment : Fragment() {

    companion object {
        fun getInstance() = TutorialStartFragment()
    }

    private val binding: FragmentTutorialStartBinding by lazy {
        FragmentTutorialStartBinding.inflate(LayoutInflater.from(context))
    }

    override fun onCreateView(inflater: LayoutInflater?,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return binding.root
    }
}