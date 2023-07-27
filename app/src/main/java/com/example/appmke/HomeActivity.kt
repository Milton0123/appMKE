package com.example.appmke

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appmke.databinding.ActivityDescriptionBinding
import com.example.appmke.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}