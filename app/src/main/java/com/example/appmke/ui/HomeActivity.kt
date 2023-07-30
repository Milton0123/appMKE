package com.example.appmke.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.ViewModelProvider
import com.example.appmke.R
import com.example.appmke.databinding.ActivityHomeBinding
import com.example.appmke.backend.MyViewModel
import com.example.appmke.backend.Products
import com.example.appmke.backend.ProductsAdapter
import com.example.appmke.backend.Repository
import com.example.appmke.backend.ViewModelFactory


class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private lateinit var viewModel : MyViewModel
    private val myRepository = Repository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        action()
    }


    private fun action(){
        val viewModelFactory = ViewModelFactory(myRepository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MyViewModel::class.java)
        initRecyclerView(viewModel.getMyListProduct())
        searchProduct()
        likedProduct()
    }

    fun initRecyclerView(listRv : List<Products>) {
        val adapter = ProductsAdapter(listRv)
        binding.rvProductsHome.adapter = adapter
    }

    private fun searchProduct(){
        binding.svProductsHome.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                val newList = mutableListOf<Products>()
                viewModel.getMyListProduct().forEach{
                    if(it.description.lowercase().contains(newText!!.lowercase())){
                        newList.add(it)
                    }
                }
                initRecyclerView(newList)
                return false
            }
        })
    }
    fun likedProduct(){


        }
    }

}
