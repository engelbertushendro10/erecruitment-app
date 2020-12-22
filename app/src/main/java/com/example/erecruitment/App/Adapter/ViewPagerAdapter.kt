package com.example.erecruitment.App.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.erecruitment.fragments.ApplyProject
import com.example.erecruitment.fragments.OnProgres

class ViewPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm){
    private val pages = listOf(
        OnProgres(),
        ApplyProject()
    )
    override fun getCount(): Int {
        return  pages.size
    }
    override fun getItem(position: Int): Fragment {
        return pages[position]
    }
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "On progres"
            1 -> "project apply"
            else -> "On progres"
        }
    }

}
















