package com.example.appmke.ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.appmke.databinding.ActivityDescriptionBinding

class DescriptionActivity : AppCompatActivity() {
    lateinit var binding: ActivityDescriptionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDescriptionBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    /* fun buyProduct() {
        Toast.makeText(this, "Producto comprado", Toast.LENGTH_SHORT).show()
    }
    
    fun init() {
        binding.bt_buy.setOnClickListener{
            buyProduct()
        }
    }*/
}