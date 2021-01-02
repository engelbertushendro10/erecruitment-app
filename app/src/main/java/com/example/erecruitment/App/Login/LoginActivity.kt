package com.example.erecruitment.App.Login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.erecruitment.App.Home.HomeActivity
import com.example.erecruitment.App.Password.ResetPassword
import com.example.erecruitment.App.Register.RegisterActivity
import com.example.erecruitment.App.api.ApiClient
import com.example.erecruitment.App.api.LoginApi
import com.example.erecruitment.App.api.SessionManager
import com.example.erecruitment.BaseActivity
import com.example.erecruitment.R
import com.example.erecruitment.databinding.ActivityLoginBinding
import kotlinx.coroutines.*


class LoginActivity : BaseActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var coroutineScope:CoroutineScope
    private lateinit var loginApi:LoginApi
    private lateinit var sessionManager: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this , R.layout.activity_login)
        coroutineScope = CoroutineScope(Job() + Dispatchers.Main)
        loginApi = ApiClient.getApiClient()!!.create(LoginApi::class.java)
        binding.signin.setOnClickListener{
            callLoginApi(binding.email.text.toString() , binding.password.text.toString())
        }
        sessionManager = SessionManager(this)
    }

    private fun callLoginApi(email: String , password: String){
        coroutineScope.launch {
            val results = withContext(Dispatchers.IO){
                try {
                    loginApi.loginRequest(email , password)
                }catch (e: Throwable){
                    e.printStackTrace()
                }
            }
            if (results is LoginResponse){
                    if (results.status == 200){
                        Toast.makeText(this@LoginActivity,"login succes",Toast.LENGTH_SHORT).show()
                        sessionManager.saveAuthToken(results.data.token)
                        loginSucces()
                    }else{
                        Toast.makeText(this@LoginActivity,"login failed",Toast.LENGTH_SHORT).show()
                    }
            }else Toast.makeText(this@LoginActivity,"Login False", Toast.LENGTH_SHORT).show()
        }
    }



    override fun onClick(v: View?) {

    }
    private fun loginSucces(){
        startActivity(Intent(this , HomeActivity::class.java))
    }

    fun signup(view: View) {
        startActivity(Intent(this , RegisterActivity::class.java))
    }

    fun forgetPassword(view: View) {
        startActivity(Intent(this , ResetPassword::class.java))
    }

}

















