package com.tuvy.tomosugi.flexiblekeyboard

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tuvy.tomosugi.flexiblekeyboard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
