package com.example.bd0631.baseproject

import android.app.Application
import com.example.bd0631.baseproject.data.*
import com.example.bd0631.baseproject.data.remote.NetModule
import com.example.bd0631.baseproject.Modules.ViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class BaseApplication: Application() {

  private val appModule = listOf(BaseRepositoryModule, ViewModelModule, NetModule)

  override fun onCreate() {
    super.onCreate()
    startKoin{
      androidLogger(Level.DEBUG)
      androidContext(this@BaseApplication)
      modules(appModule)
    }
  }
}