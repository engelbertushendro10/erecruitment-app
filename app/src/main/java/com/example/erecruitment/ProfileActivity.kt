package com.example.erecruitment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.erecruitment.R.id.btn_calc
import com.example.erecruitment.R.id.btn_dice
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigation.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.ic_home ->home()
                R.id.ic_search ->search()
                R.id.ic_profile ->profile()
            }
            true
        }
        val btnDice = findViewById<Button>(btn_dice)
        btnDice.setOnClickListener {
            val i = Intent(this, RolldiceActivity::class.java)
            startActivity(i)
        }
        val btncalc = findViewById<Button>(btn_calc)
        btncalc.setOnClickListener {
            val i = Intent(this , CalculatorsActivity::class.java)
            startActivity(i)
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
