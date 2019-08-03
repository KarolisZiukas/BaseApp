package com.example.bd0631.baseproject.data.local

import com.example.bd0631.baseproject.data.BaseModel
import com.example.bd0631.baseproject.data.remote.Post

interface BaseRepository {
  suspend fun getAllEntities(): List<BaseModel>

  suspend fun getPosts(): Post
}