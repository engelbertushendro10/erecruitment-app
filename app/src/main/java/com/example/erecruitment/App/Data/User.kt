package com.example.erecruitment.App.Data

import com.google.gson.annotations.SerializedName

data class User (
    @SerializedName("id_user")
    var id_user: String,

    @SerializedName("username")
    var username: String,

    @SerializedName("email")
    var email: String,

    @SerializedName("role")
    var role: String

)
