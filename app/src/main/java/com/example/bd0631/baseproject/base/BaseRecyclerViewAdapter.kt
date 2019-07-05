package com.example.bd0631.baseproject.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BaseRecyclerViewAdapter<T: BaseRecyclerViewItem>(private val itemsList: ArrayList<T>):
    RecyclerView.Adapter<BindingHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
      BindingHolder(LayoutInflater.from(parent.context).inflate(viewType, parent, false))

  override fun getItemCount() = itemsList.size

  override fun onBindViewHolder(holder: BindingHolder, position: Int) {
      itemsList[position].bindItems(holder, position)
  }

  override fun getItemViewType(position: Int): Int {
    return itemsList[position].layoutId()
  }
}