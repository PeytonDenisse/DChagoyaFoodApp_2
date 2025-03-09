package com.example.dchagoyafoodapp.models

data class Food(
    val name: String,
    val imageUrl: String,
    val rating: Double,
    val price: Double
)


val FoodList = listOf(
    Food("Whopper", "https://example.com/whopper.png", 4.5, 99.8),
    Food("Chicken Fries", "https://example.com/chickenfries.png", 4.3, 59.8),
    Food("Big Mac", "https://example.com/bigmac.png", 4.6, 79.8),
    Food("McFlurry", "https://example.com/mcflurry.png", 4.7, 49.8),
    Food("Pepperoni Pizza", "https://example.com/pepperonipizza.png", 4.8, 129.9)
)
