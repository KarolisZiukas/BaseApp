package com.example.bd0631.baseproject.mainFragment2

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.example.bd0631.baseproject.R
import com.example.bd0631.baseproject.base.BaseFragment
import com.example.bd0631.baseproject.databinding.MainFragmentBinding
import kotlinx.android.synthetic.main.main_fragment.*
import javax.inject.Inject

class MainFragment @Inject constructor() :
    BaseFragment<MainFragmentBinding, MainViewModel2>() {

  override val layoutId: Int = R.layout.main_fragment
  override val viewModelClass = MainViewModel2::class

  override fun onViewCreated(
      view: View,
      savedInstanceState: Bundle?
  ) {
    super.onViewCreated(view, savedInstanceState)
    b_test_click.setOnClickListener {
    }
  }

  override fun onObserve(viewModel: MainViewModel2) {
    super.onObserve(viewModel)
    viewModel.isLoading.observe(this, Observer {
    })

  }
}