package com.example.erecruitment.App.Login

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.erecruitment.App.Home.HomeActivity
import com.example.erecruitment.App.Password.ResetPassword
import com.example.erecruitment.App.Register.RegisterActivity
import com.example.erecruitment.BaseActivity
import com.example.erecruitment.R
import com.example.erecruitment.databinding.ActivityLoginBinding

class LoginActivity : BaseActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var pref:SharedPreferences

//===========set variable =========
    private val PREFS_NAME = "userpreferences"
    private val KEY_EMAIL = "key.email"
    private val KEY_PASSWORD = "key.password"
//======================
    @SuppressLint("WrongViewCast", "ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        app()
        binding= DataBindingUtil.setContentView(this, R.layout.activity_login)
        pref = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

        fun intent(){
            val a = Intent(this, RegisterActivity::class.java)
            startActivity(a)
        }
        fun forget(){
            val a = Intent(this, ResetPassword::class.java)
            startActivity(a)
        }

        binding.signup.setOnTouchListener { v, event ->
            when (event?.action) {
                MotionEvent.ACTION_DOWN -> {
                    intent()
                }
            }
            v?.onTouchEvent(event) ?: true
        }
        binding.forgetpassword.setOnTouchListener { v, event ->
            when (event?.action) {
                MotionEvent.ACTION_DOWN -> {
                    forget()
                }
            }
            v?.onTouchEvent(event) ?: true
        }
    }

    override fun onClick(v: View?) {}
    private fun saveEmail(email: String){
        val editor:SharedPreferences.Editor = pref.edit()
        editor.putString(KEY_EMAIL,email)
        editor.apply()
    }

    private fun savePassword(password: String){
        val editor:SharedPreferences.Editor = pref.edit()
        editor.putString(KEY_PASSWORD, password)
        editor.apply()
    }
    private lateinit var login:Login
    fun onLogin(view: View) {
       val email:String = binding.email.text.toString()
        saveEmail(email)
        val password:String =binding.password.text.toString()
        savePassword(password)
        msg()
    }
    private fun msg(){
        val email:String = binding.email.text.toString()
        val password:String = binding.password.text.toString()
        when{
            email =="" ->{
                val msg: Toast = Toast.makeText(applicationContext,"Please Input EMail", Toast.LENGTH_LONG)
                msg.setGravity(Gravity.TOP, 0,140)
                msg.show()
            }
            password == "" ->{
                val msg: Toast = Toast.makeText(applicationContext,"please Input Password", Toast.LENGTH_SHORT)
                msg.setGravity(Gravity.TOP,0,140)
                msg.show()
            }else ->{
            val msg: Toast = Toast.makeText(applicationContext,"You are Login", Toast.LENGTH_SHORT)
            msg.setGravity(Gravity.TOP,0,140)
            msg.show()
            startActivity(Intent(this, HomeActivity::class.java))
        }
        }
    }
    fun clear(){
        val editor:SharedPreferences.Editor = pref.edit()
        editor.clear()
        editor.apply()
    }
    private fun getEmail():String? =pref.getString(KEY_EMAIL, null)
    private fun getPassword():String? =pref.getString(KEY_PASSWORD,null)
}
