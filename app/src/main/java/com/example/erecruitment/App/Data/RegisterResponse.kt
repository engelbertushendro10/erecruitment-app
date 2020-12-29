package com.example.erecruitment.App.Data

import com.google.gson.annotations.SerializedName

data class RegisterResponse(
    @SerializedName("status_code")
    var status: Int,

    @SerializedName("message")
    var message: String,

    @SerializedName("posts")
    var posts: List<Register>
)
