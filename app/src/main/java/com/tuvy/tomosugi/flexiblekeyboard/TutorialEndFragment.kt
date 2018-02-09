package com.tuvy.tomosugi.flexiblekeyboard

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tuvy.tomosugi.flexiblekeyboard.databinding.FragmentTutorialEndBinding

class TutorialEndFragment : Fragment() {

    companion object {
        fun getInstance() = TutorialEndFragment()
    }

    private val binding: FragmentTutorialEndBinding by lazy {
        FragmentTutorialEndBinding.inflate(LayoutInflater.from(context))
    }

    override fun onCreateView(inflater: LayoutInflater?,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return binding.root
    }
}