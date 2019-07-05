package com.example.bd0631.baseproject.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.example.bd0631.baseproject.BR
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlin.reflect.KClass


abstract class BaseFragment<T : ViewDataBinding, U : BaseViewModel> : Fragment() {

  abstract val layoutId: Int
  abstract val viewModelClass: KClass<U>

  protected open val viewModel: U by lazy { viewModel(viewModelClass).value }

  private lateinit var databinding: T

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?): View? {
    databinding = DataBindingUtil.inflate(inflater, layoutId, container, false)
    databinding.setVariable(BR.viewModel, viewModel)
    databinding.lifecycleOwner = this
    return databinding.root
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    onObserve(viewModel)
    super.onCreate(savedInstanceState)
  }

  protected open fun onObserve(viewModel: U) {
  }
}