package com.example.appmke.backend

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.appmke.R
import com.example.appmke.databinding.ItemProductsBinding
import com.squareup.picasso.Picasso

class ProductsAdapter(private val listOfProducts : List<Products>):RecyclerView.Adapter<ProductHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_products,parent, false)
        return ProductHolder(view)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.render(listOfProducts[position])
    }

    override fun getItemCount(): Int {
        return listOfProducts.size
    }
}
class ProductHolder(view : View): RecyclerView.ViewHolder(view){
    private val binding = ItemProductsBinding.bind(view)
    fun render(value : Products){
        Picasso.get().load(value.url).into(binding.ivImageHome)
        binding.tvDescriptionHome.text = value.description
        binding.tvPriceHome.text = value.price.toString()
        binding.tvOffersPercentHome.text = value.offersPercent
        binding.ivFavoriteHome.setImageResource(R.drawable.ic_heart)

    }

}


