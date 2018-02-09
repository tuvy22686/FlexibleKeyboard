package com.tuvy.tomosugi.flexiblekeyboard

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.app.AppCompatActivity
import com.tuvy.tomosugi.flexiblekeyboard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupTutorial()
    }

    private fun setupTutorial() {
        val fragments = listOf(TutorialStartFragment.getInstance(), TutorialEndFragment.getInstance())
        binding.viewPager.offscreenPageLimit = fragments.size - 1
        binding.viewPager.adapter = ViewPagerAdapter(fragments, supportFragmentManager)
    }

    private class ViewPagerAdapter(private val fragments: List<Fragment>, fm: FragmentManager) : FragmentPagerAdapter(fm) {
        override fun getItem(position: Int) = fragments[position]
        override fun getCount() = fragments.size
    }
}
