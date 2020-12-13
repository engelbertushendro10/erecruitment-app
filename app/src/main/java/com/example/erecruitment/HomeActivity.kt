package com.example.erecruitment
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

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
















