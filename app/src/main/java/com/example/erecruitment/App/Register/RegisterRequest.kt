package com.example.erecruitment.App.Register

import com.google.gson.annotations.SerializedName

class RegisterRequest (@SerializedName("email") var email: String ,
                       @SerializedName("password") var password: String ,
                       @SerializedName("password") var role: String)