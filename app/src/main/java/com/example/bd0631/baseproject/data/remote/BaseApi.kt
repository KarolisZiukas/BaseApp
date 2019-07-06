package com.example.bd0631.baseproject.data.remote

import retrofit2.http.GET

interface PostApi {
  @GET("/posts/1")
  suspend fun getPosts(): Post
}