package com.example.erecruitment.App.Response

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("email")
    val email: String,

    @SerializedName("id_user")
    val id_user: String,

    @SerializedName("role")
    val role: String,

    @SerializedName("token")
    val token: String,

    @SerializedName("userEngineer")
    val userEngineer: String
)





















