package com.example.bd0631.baseproject.data

import androidx.room.Room
import com.example.bd0631.baseproject.data.local.AppDatabase
import com.example.bd0631.baseproject.data.local.BaseRepository
import com.example.bd0631.baseproject.data.local.BaseRepositoryImpl
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val BaseRepositoryModule = module {

  single {
    Room.databaseBuilder(androidApplication(), AppDatabase::class.java, "base-db")
        .build()
  }

  single {
    get<AppDatabase>().baseDao()
  }

  single { BaseRepositoryImpl(get(), get()) as BaseRepository } //Do not listen to IDE suggestion

}