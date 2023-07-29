package com.example.appmke.backend

class Repository  {


  fun getListProducts(): MutableList<Products>{
      return ProductsLists.list
    }
}
