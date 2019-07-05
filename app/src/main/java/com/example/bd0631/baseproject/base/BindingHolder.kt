package com.example.bd0631.baseproject.base

import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class BindingHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

  val binding: ViewDataBinding = DataBindingUtil.bind(itemView)!!

}