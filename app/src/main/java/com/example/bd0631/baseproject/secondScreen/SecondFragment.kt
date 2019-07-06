package com.example.bd0631.baseproject.secondScreen

import com.example.bd0631.baseproject.R
import com.example.bd0631.baseproject.base.BaseFragment
import com.example.bd0631.baseproject.databinding.SecondFragmentBinding

class SecondFragment : BaseFragment<SecondFragmentBinding, SecondViewModel>() {

  override val layoutId = R.layout.second_fragment
  override val viewModelClass = SecondViewModel::class

}
