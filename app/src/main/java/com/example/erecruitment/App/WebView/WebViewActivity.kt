package com.example.erecruitment.App.WebView

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.erecruitment.App.Home.HomeActivity
import com.example.erecruitment.App.Profile.ProfileActivity
import com.example.erecruitment.App.Search.SearchActivity
import com.example.erecruitment.BaseActivity
import com.example.erecruitment.R
import com.example.erecruitment.databinding.ActivityWebViewBinding

class WebViewActivity : BaseActivity() {

    private lateinit var binding: ActivityWebViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_web_view)
        app()
        binding.webView.webViewClient = MyWebViewClient(this)
        binding.webView.loadUrl("https://github.com/engelbertushendro10")

        binding.bottomNavigation.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.ic_home ->home()
                R.id.ic_search ->search()
                R.id.ic_profile ->profile()
            }
            true
        }
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


















