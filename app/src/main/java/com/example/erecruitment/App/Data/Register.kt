package com.example.erecruitment.App.Data

import com.google.gson.annotations.SerializedName

data class Register (
    @SerializedName("id")
    var id: Int,

    @SerializedName("title")
    var title: String,

    @SerializedName("description")
    var description: String,

    @SerializedName("content")
    var content: String
)