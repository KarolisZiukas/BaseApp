package com.example.bd0631.baseproject.data.remote

import java.io.Serializable

data class Post (
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
) : Serializable