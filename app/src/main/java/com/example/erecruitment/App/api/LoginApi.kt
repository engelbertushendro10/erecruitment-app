package com.example.erecruitment.App.api

import com.example.erecruitment.App.Login.LoginResponse
import com.example.erecruitment.App.Register.RegisterResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface LoginApi {
    @FormUrlEncoded
    @POST(value = "user/login")
    suspend fun loginRequest(@Field("email") email: String , @Field("password") password: String): LoginResponse

    @FormUrlEncoded
    @POST(value = "user")
    suspend fun registerRequest(@Field("email") email: String, @Field("password") password: String, @Field("role")role:String): RegisterResponse
}






