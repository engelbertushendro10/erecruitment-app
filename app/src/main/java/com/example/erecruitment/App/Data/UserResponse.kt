package com.example.erecruitment.App.Data

data class UserResponse(
    val `data`: List<Data>,
    val message: String,
    val status: Int,
    val success: String
)