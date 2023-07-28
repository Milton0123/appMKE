package com.example.appmke.backend

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class MyViewModel: ViewModel() {
    val data = MutableLiveData<Products?>()

    val myRepository = Repository()


//    fun requestProduct(products: Products) {
//        CoroutineScope(Dispatchers.IO).launch {
//            val result= myRepository.getListProducts()
//            data.postValue(result)
//        }
//    }


}