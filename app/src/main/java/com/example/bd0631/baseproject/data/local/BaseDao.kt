package com.example.bd0631.baseproject.data.local

import androidx.room.Dao
import androidx.room.Query
import com.example.bd0631.baseproject.data.BaseModel

@Dao
interface BaseDao {

  @Query("SELECT * FROM BaseApplication")
  suspend fun getAllEntities(): List<BaseModel>

}