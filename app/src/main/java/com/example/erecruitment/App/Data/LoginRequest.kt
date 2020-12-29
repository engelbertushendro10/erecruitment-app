package com.example.erecruitment.App.Data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class LoginRequest (
    @SerializedName("email")
    @Expose
    var email: String? = null,

    @SerializedName("password")
    @Expose
    var password: String? = null
)














