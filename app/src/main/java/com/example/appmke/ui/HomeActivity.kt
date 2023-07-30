package com.example.appmke.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SearchView
import com.example.appmke.databinding.ActivityHomeBinding
import com.example.appmke.backend.MyViewModel
import com.example.appmke.backend.Products
import com.example.appmke.backend.ProductsAdapter
import com.example.appmke.backend.Repository


class HomeActivity : AppCompatActivity() {
    lateinit var binding : ActivityHomeBinding
    private lateinit var viewModel: MyViewModel
    val miRepository = Repository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        action()
    }

    fun action(){
        initRecyclerView(miRepository.getListProducts())
        searhProduct()
    }

    fun initRecyclerView(listRv : List<Products>){
        val adapter = ProductsAdapter(listRv)
        binding.rvProductsHome.adapter = adapter
    }

    fun searhProduct(){
        binding.svProductsHome.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                val newList = mutableListOf<Products>()
                miRepository.getListProducts().forEach{
                    if(it.name.contains(query!!)){
                        newList.add(it)
                    }
                }
                initRecyclerView(newList)
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }
        })
    }



}