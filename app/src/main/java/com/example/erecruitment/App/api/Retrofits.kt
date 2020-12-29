package com.example.erecruitment.App.api

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofits {
    fun getRetrofitClientInstance(): Retrofit {
        val gson = GsonBuilder().setLenient().create()
        return Retrofit.Builder()
            .baseUrl("http://34.201.104.99:4000/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
}
















