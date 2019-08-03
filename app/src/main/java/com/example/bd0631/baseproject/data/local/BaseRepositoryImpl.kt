package com.example.bd0631.baseproject.data.local

import com.example.bd0631.baseproject.data.BaseModel
import com.example.bd0631.baseproject.data.remote.Post
import com.example.bd0631.baseproject.data.remote.PostApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BaseRepositoryImpl @Inject constructor(
    private val baseDao: BaseDao,
    private val baseApi: PostApi
): BaseRepository {

  override suspend fun getAllEntities(): List<BaseModel> {
    return baseDao.getAllEntities()
  }

  override suspend fun getPosts(): Post {
    return baseApi.getPosts()
  }
}