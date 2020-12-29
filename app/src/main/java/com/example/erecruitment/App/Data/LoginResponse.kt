package com.example.erecruitment.App.Data

import com.google.gson.annotations.SerializedName

data class LoginResponse (
    @SerializedName("status")
    var status: Int,

    @SerializedName("token")
    var token: String,

    @SerializedName("user")
    var user: User
)
