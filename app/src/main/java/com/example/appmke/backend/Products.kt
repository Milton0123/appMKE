package com.example.appmke.backend

import com.example.appmke.backend.data.Owner
import com.example.appmke.backend.data.Promotion

data class Products(
    val id: Int,
    val name: String,
    val brand: String,
    val price: Double,
    val offersPrice: Double,
    val offersPercent: String,
    val money: String,
    val freeSend: Boolean,
    val promotion: Promotion,
    val date: String,
    val isFavorite: Boolean,
    val isPromotion: Boolean,
    val owner: Owner,
    val sold: Int,
    val punctuation: Double,
    val oldPrice: Double,
    val description: String,
    val discount: String,
    val sendPrice: Double,
    val location: String,
    val url: String
)
