package com.example.appmke.backend.data

import com.example.appmke.backend.data.Cards

data class Promotion(
    val price: Double,
    val dues: Int,
    val cards: Cards
)
