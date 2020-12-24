package com.example.erecruitment.App.Profile

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import com.example.erecruitment.App.Home.HomeActivity
import com.example.erecruitment.App.Login.LoginActivity
import com.example.erecruitment.App.Search.SearchActivity
import com.example.erecruitment.BaseActivity
import com.example.erecruitment.R
import com.example.erecruitment.databinding.ActivityProfileBinding

class ProfileActivity : BaseActivity() {
    private lateinit var binding:ActivityProfileBinding
    private lateinit var pref: SharedPreferences
    //===========set variable =========
    val PREFS_NAME = "userpreferences"
    val KEY_EMAIL = "key.email"
    val KEY_PASSWORD = "key.password"

//    =============================//

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this,R.layout.activity_profile)
        pref = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        binding.bottomNavigation.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.ic_home ->home()
                R.id.ic_search ->search()
                R.id.ic_profile ->profile()
            }
            true
        }
            binding.logout.setOnClickListener() {
                val builder = AlertDialog.Builder(this@ProfileActivity)
                builder.setTitle("Need To Signout?")
                builder.setMessage("You Will Be Sign Out From Aplication")
                builder.setPositiveButton("YES") { dialog , which ->
                    Toast.makeText(applicationContext , "You are Logout." , Toast.LENGTH_SHORT)
                        .show()
                    onClicks(v = null)
                }
                builder.setNegativeButton("No") { dialog , which ->
                    Toast.makeText(applicationContext , "You are not agree." , Toast.LENGTH_SHORT)
                        .show()
                }
                val dialog: AlertDialog = builder.create()
                dialog.show()
        }
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
    private fun clear(){
        val editor:SharedPreferences.Editor = pref.edit()
        editor.clear()
        editor.apply()
    }
    private fun onClicks(v: View?) {
        clear()
        startActivity(Intent(this, LoginActivity::class.java))
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
