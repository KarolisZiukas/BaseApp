package com.example.bd0631.baseproject.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.bd0631.baseproject.R
import com.example.bd0631.baseproject.extensions.replaceFragmentInActivity

abstract class BaseActivity: AppCompatActivity() {

  abstract val layoutId: Int
  abstract fun getFragment(): Fragment
  private val contentFrameId = R.id.content_frame

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layoutId)
    supportFragmentManager.findFragmentById(contentFrameId) ?:
    getFragment().also {
      replaceFragmentInActivity(it, contentFrameId)
    }
  }
}