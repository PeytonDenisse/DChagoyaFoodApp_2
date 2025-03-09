package com.example.dchagoyafoodapp.models

data class Restaurant(
    val name: String,
    val imageUrl: String
)

val RestaurantsList = listOf(
    Restaurant("Burger King", "https://example.com/burgerking.png"),
    Restaurant("McDonald's", "https://example.com/mcdonalds.png"),
    Restaurant("KFC", "https://example.com/kfc.png"),
    Restaurant("Pizza Hut", "https://example.com/pizzahut.png"),
    Restaurant("Subway", "https://example.com/subway.png")
)