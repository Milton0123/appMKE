package com.example.appmke.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appmke.databinding.ActivityHomeBinding
import com.example.appmke.backend.MyViewModel
import com.example.appmke.backend.ProductsAdapter
import com.example.appmke.backend.Repository


class HomeActivity : AppCompatActivity() {
    lateinit var binding : ActivityHomeBinding

    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        action()
    }

    fun action(){
        initRecyclerView()
    }

    fun initRecyclerView(){
        val adapter = ProductsAdapter(viewModel.getMyListProduct())
        binding.rvProductsHome.adapter = adapter
    }



}
