package com.example.bd0631.baseproject.mainFragment2

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bd0631.baseproject.R
import com.example.bd0631.baseproject.base.BaseActivity
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity: BaseActivity() {

  private lateinit var navController: NavController

  override val layoutId = R.layout.main_activity

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    navController = findNavController(R.id.navFragment)
    bottomNavigationBar.setupWithNavController(navController)
  }

}
