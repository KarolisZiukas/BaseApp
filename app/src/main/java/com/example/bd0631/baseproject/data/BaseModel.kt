package com.example.bd0631.baseproject.data

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "BaseApplication")
data class BaseModel(
    @PrimaryKey @NonNull var id: Long = 0)