package com.example.erecruitment.App.Login

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.erecruitment.App.Response.LoginResponse
import com.example.erecruitment.App.api.ApiClient
import com.example.erecruitment.App.api.LoginApi
import com.example.erecruitment.BaseActivity
import com.example.erecruitment.R
import com.example.erecruitment.databinding.ActivityLoginBinding
import kotlinx.coroutines.*

class LoginActivity : BaseActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var coroutineScope:CoroutineScope
    private lateinit var loginApi:LoginApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        coroutineScope = CoroutineScope(Job()+Dispatchers.Main)
        loginApi = ApiClient.getApiClient()!!.create(LoginApi::class.java)
        binding.signin.setOnClickListener{
            callLoginApi(binding.email.text.toString(), binding.password.text.toString())
        }
    }

    private fun callLoginApi(email: String, password:String){
        coroutineScope.launch {
            val result = withContext(Dispatchers.IO){
                try {
                    loginApi.loginRequest(email,password)
                }catch (e:Throwable){
                    e.printStackTrace()
                }
            }
            if (result is LoginResponse){
                Log.d("loginReq", result.toString())
            }
        }
    }

    override fun onClick(v: View?) {

    }

}

















