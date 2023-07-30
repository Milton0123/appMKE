package com.example.appmke.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.ViewModelProvider
import com.example.appmke.databinding.ActivityHomeBinding
import com.example.appmke.backend.MyViewModel
import com.example.appmke.backend.Products
import com.example.appmke.backend.ProductsAdapter
import com.example.appmke.backend.Repository
import com.example.appmke.backend.ViewModelFactory


class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private val myRepository = Repository()
    private val viewModelFactory = ViewModelFactory(myRepository)
    private val viewModel = ViewModelProvider(this, viewModelFactory).get(MyViewModel::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        action()
    }


    fun action(){
        initRecyclerView(viewModel.getMyListProduct())
        searchProduct()
    }

    fun initRecyclerView(listRv : List<Products>) {
        val adapter = ProductsAdapter(listRv)
        binding.rvProductsHome.adapter = adapter
    }

    fun searchProduct(){
        binding.svProductsHome.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                val newList = mutableListOf<Products>()
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
        }
    }
