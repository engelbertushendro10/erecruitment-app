package com.example.erecruitment

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w: Window = window
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        }
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        Handler().postDelayed({
                              val intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
        }, 3000)
    }

    fun onOperator(view: View) {}
    fun onDecimal(view: View) {}
    fun onBreaketStart(view: View) {}
    fun onBreaketEnd(view: View) {}
    fun onDigit(view: View) {}
    fun onClear(view: View) {}
    fun onDelete(view: View) {}
    fun onEqual(view: View) {}
}