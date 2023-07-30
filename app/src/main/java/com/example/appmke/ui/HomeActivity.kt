package com.example.appmke.ui

import android.content.Intent
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
import com.example.appmke.ui.Constants.miItem


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
    }

    fun initRecyclerView(listRv : List<Products>) {
        val adapter = ProductsAdapter(listRv, clickItem = {goToDetails.invoke(it)})
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


    private val goToDetails = fun (item : Products){
        val intent = Intent(this, DescriptionActivity::class.java)
        miItem = item
        startActivity(intent)

    }


}
object Constants{
    var miItem : Products? = null
}