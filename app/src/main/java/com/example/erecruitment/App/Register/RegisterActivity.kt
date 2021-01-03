package com.example.erecruitment.App.Register

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.erecruitment.App.api.ApiClient
import com.example.erecruitment.App.api.LoginApi
import com.example.erecruitment.BaseActivity
import com.example.erecruitment.R
import com.example.erecruitment.databinding.ActivityRegisterBinding
import kotlinx.coroutines.*

class RegisterActivity : BaseActivity() {
    private lateinit var binding: ActivityRegisterBinding
    private lateinit var coroutineScope: CoroutineScope
    private lateinit var loginApi: LoginApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this , R.layout.activity_register)
        coroutineScope = CoroutineScope(Job() + Dispatchers.Main)
        loginApi = ApiClient.getApiClient()!!.create(LoginApi::class.java)
        app()
        binding.signup.setOnClickListener {
            val role = binding.radioPirates
            callRegisterFun(binding.email.text.toString() ,
                binding.password.text.toString() ,
                role.text.toString())
        }
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

    private fun callRegisterFun(email: String , password: String , role: String) {
        coroutineScope.launch {
            val results = withContext(Dispatchers.IO) {
                try {
                    loginApi.registerRequest(email , password , role = "1")
                } catch (e: Throwable) {
                    e.printStackTrace()
                }
            }
            if (results is RegisterResponse) {
                Toast.makeText(this@RegisterActivity , "success add engineer" , Toast.LENGTH_SHORT)
                    .show()
            } else {
                Toast.makeText(this@RegisterActivity , "Ada yang Salah" , Toast.LENGTH_SHORT).show()
            }
        }

    }
}