package com.example.bd0631.baseproject.mainFragment2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.bd0631.baseproject.base.BaseViewModel
import com.example.bd0631.baseproject.data.local.BaseRepository
import com.example.bd0631.baseproject.data.remote.Post
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel2 @Inject constructor(
    val baseRepository: BaseRepository
) : BaseViewModel() {

  val isLoading = MutableLiveData<Boolean>()
  val post = MutableLiveData<Post>()

  fun onTextClick() {
    isLoading.value = true
    viewModelScope.launch {
      post.value = baseRepository.getPosts()
      isLoading.value = false
    }
  }
}