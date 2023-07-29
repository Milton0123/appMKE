package com.example.appmke.backend

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory ( private val myRepo: Repository): ViewModelProvider.Factory{
  override fun <T : ViewModel> create(modelClass: Class<T>): T {
      return MyViewModel() as T
    }
}