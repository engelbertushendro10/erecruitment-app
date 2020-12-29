package com.example.erecruitment.App.api

import okhttp3.Interceptor
import okhttp3.Response

class headerInterceptor():Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response = chain.run{
        val tokenAuth = "token"
        proceed(
            request().newBuilder()
            .addHeader("Authorization", "Barer $tokenAuth")
            .build())
    }

}