package com.example.bd0631.baseproject.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.bd0631.baseproject.data.BaseModel

@Database(entities = [(BaseModel::class)], version = 1)
abstract class AppDatabase: RoomDatabase() {

  abstract fun baseDao(): BaseDao

}
