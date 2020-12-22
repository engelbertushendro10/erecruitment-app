package com.example.erecruitment

import android.content.Context
import android.content.Intent
import android.os.Build
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity():AppCompatActivity(), View.OnClickListener {

    protected inline fun <reified Activity>BaseActivity(context: Context){
        context.startActivity(Intent(context, Activity::class.java))
    }
    protected fun app(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w: Window = window
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        }
    }
}