package com.example.bd0631.baseproject.Modules

import com.example.bd0631.baseproject.mainFragment2.MainViewModel2
import com.example.bd0631.baseproject.secondScreen.SecondViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val ViewModelModule = module {

  viewModel { MainViewModel2(get()) }

  viewModel { SecondViewModel() }

}