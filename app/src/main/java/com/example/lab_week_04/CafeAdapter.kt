package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class CafeAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    // Titles for each tab
    private val TABS_FIXED = listOf(
        R.string.starbucks_title,
        R.string.janjijiwa_title,
        R.string.kopikenangan_title,
    )

    override fun getItemCount(): Int {
        return TABS_FIXED.size
    }

    override fun createFragment(position: Int): Fragment {
        // TODO: Later you can pass different data per position
        return CafeDetailFragment()
    }

    fun getTabTitle(position: Int): Int {
        return TABS_FIXED[position]
    }
}
