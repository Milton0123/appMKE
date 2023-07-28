package com.example.appmke.backend

class Repository  {


    suspend fun getListProducts(): MutableList<Products>{
      return ProductsLists.list
    }
}