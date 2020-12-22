package com.example.erecruitment.App.Search

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.erecruitment.App.Adapter.ViewPagerAdapter
import com.example.erecruitment.App.Home.HomeActivity
import com.example.erecruitment.App.Profile.ProfileActivity
import com.example.erecruitment.BaseActivity
import com.example.erecruitment.R.id
import com.example.erecruitment.R.layout
import com.example.erecruitment.databinding.ActivitySearchBinding

class SearchActivity : BaseActivity() {

    private lateinit var binding:ActivitySearchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layout.activity_search)
        app()
        binding.bottomNavigation.setOnNavigationItemSelectedListener{
            when(it.itemId){
                id.ic_home ->home()
                id.ic_search ->search()
                id.ic_profile ->profile()
            }
            true
        }
        binding.mainPager.adapter = ViewPagerAdapter(supportFragmentManager)
        binding.tabLayout.setupWithViewPager(binding.mainPager)
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
    private fun profile(){
        val a = Intent(this, ProfileActivity::class.java)
        startActivity(a)
    }
    private fun home (){
        val a = Intent(this, HomeActivity::class.java)
        startActivity(a)
    }
    private fun search (){
        val a = Intent(this, SearchActivity::class.java)
        startActivity(a)
    }
}
