package com.example.appmke.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.appmke.databinding.ActivityHomeBinding
import com.example.appmke.backend.MyViewModel
import com.example.appmke.backend.ProductsAdapter
import com.example.appmke.backend.Repository
import com.example.appmke.backend.ViewModelFactory


class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    private lateinit var viewModel: MyViewModel
    private val myRepository = Repository()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        action()
    }

    fun action() {
        initRecyclerView()
    }

    fun initRecyclerView() {
        val viewModelFactory = ViewModelFactory(myRepository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MyViewModel::class.java)

        val adapter = ProductsAdapter(viewModel.getMyListProduct())
        binding.rvProductsHome.adapter = adapter
    }


}
