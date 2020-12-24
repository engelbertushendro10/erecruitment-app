
package com.example.erecruitment.App.Home
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.erecruitment.App.Adapter.ProjectAdapter
import com.example.erecruitment.App.Adapter.ProjectAdapter.ViewHolder
import com.example.erecruitment.App.Profile.ProfileActivity
import com.example.erecruitment.App.Search.SearchActivity
import com.example.erecruitment.BaseActivity
import com.example.erecruitment.R
import com.example.erecruitment.databinding.ActivityHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class  HomeActivity : BaseActivity(){
    private lateinit var binding: ActivityHomeBinding
    private var layoutManager: LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

        layoutManager = LinearLayoutManager(this)
        binding.recyclerview.layoutManager = layoutManager
        adapter = ProjectAdapter()
        binding.recyclerview.adapter=adapter

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigation.setOnNavigationItemSelectedListener{
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






