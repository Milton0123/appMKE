package com.example.appmke.back

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appmke.R
import com.example.appmke.backend.Products
import com.example.appmke.databinding.ItemProductsBinding

class productsAdapter(private val listOfProducts : List<Products>):RecyclerView.Adapter<productHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): productHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_products,parent, false)
        return productHolder(view)
    }

    override fun onBindViewHolder(holder: productHolder, position: Int) {
        holder.render(listOfProducts[position])
    }

    override fun getItemCount(): Int {
        return listOfProducts.size
    }
}
class productHolder(view : View): RecyclerView.ViewHolder(view){
    private val binding = ItemProductsBinding.bind(view)
    fun render(value : Products){
        binding.ivImageHome.setImageResource(value.url.toInt())
        binding.tvDescriptionHome.text = value.description
        binding.tvPriceHome.text = value.price.toString()
        binding.tvOffersPercentHome.text = value.isPromotion.toString()
        binding.tvFreeSendHome.text = value.freeSend.toString()
    }

}