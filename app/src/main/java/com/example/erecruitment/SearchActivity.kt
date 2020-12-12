package com.example.erecruitment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
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

    fun profile(){
        val a = Intent(this, ProfileActivity::class.java)
        startActivity(a)
    }
    fun home (){
        val a = Intent(this, HomeActivity::class.java)
        startActivity(a)
    }
    fun search (){
        val a = Intent(this, SearchActivity::class.java)
        startActivity(a)
    }
    }