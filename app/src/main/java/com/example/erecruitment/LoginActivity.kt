package com.example.erecruitment

import android.annotation.SuppressLint
import android.content.Intent
import android.nfc.NfcAdapter.EXTRA_DATA
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.erecruitment.fragments.HomeFragment
import org.w3c.dom.Text
class LoginActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast", "ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w: Window = window
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        }
        setContentView(R.layout.activity_login)

        val btn_login = findViewById<Button>(R.id.signin)
        val signup = findViewById<TextView>(R.id.signup)
        val forgetpassword = findViewById<TextView>(R.id.forgetpassword)

        btn_login.setOnClickListener {
            val i = Intent(this, HomeActivity::class.java)
            startActivity(i)
        }

        fun intent(){
            val a = Intent(this, RegisterActivity::class.java)
            startActivity(a)
        }
        fun forget(){
            val a = Intent(this, ResetPassword::class.java)
            startActivity(a)
        }

        signup.setOnTouchListener { v, event ->
            when (event?.action) {
                MotionEvent.ACTION_DOWN -> {
                    intent()
                }
            }
            v?.onTouchEvent(event) ?: true
        }
        forgetpassword.setOnTouchListener { v, event ->
            when (event?.action) {
                MotionEvent.ACTION_DOWN -> {
                    forget()
                }
            }
            v?.onTouchEvent(event) ?: true
        }
    }
}
















