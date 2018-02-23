package com.tuvy.tomosugi.flexiblekeyboard.presentation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.tuvy.tomosugi.flexiblekeyboard.databinding.ActivityMainBinding
import com.tuvy.tomosugi.flexiblekeyboard.misc.BaseActivity
import com.tuvy.tomosugi.flexiblekeyboard.util.DisplayUtil

class MainActivity : BaseActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initDisplaySize()
        setupTutorial()
    }

    private fun initDisplaySize() {
        val preference = Preference(this)
        preference.setDisplaySizeHeight(DisplayUtil.getDisplaySize(this).x)
        preference.setDisplaySizeWidth(DisplayUtil.getDisplaySize(this).y)
    }

    private fun setupTutorial() {
        val fragments = listOf(TutorialStartFragment.getInstance(), TutorialEndFragment.getInstance())
        binding.viewPager.offscreenPageLimit = fragments.size - 1
        binding.viewPager.adapter = ViewPagerAdapter(fragments, supportFragmentManager)

        binding.tabLayout.setupWithViewPager(binding.viewPager, true)
    }

    private class ViewPagerAdapter(private val fragments: List<Fragment>, fm: FragmentManager) : FragmentPagerAdapter(fm) {
        override fun getItem(position: Int) = fragments[position]
        override fun getCount() = fragments.size
    }
}
