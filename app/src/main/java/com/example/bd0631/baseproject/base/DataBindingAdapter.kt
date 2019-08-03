package com.example.bd0631.baseproject.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

abstract class DataBindingAdapter<T>(diffCallback: DiffUtil.ItemCallback<T>) :
    ListAdapter<T, BindingHolder>(diffCallback) {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingHolder {
    val layoutInflater = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
    return BindingHolder(layoutInflater)
  }
}