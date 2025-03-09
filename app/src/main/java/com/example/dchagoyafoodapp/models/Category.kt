package com.example.dchagoyafoodapp.models

data class Category(
    val name: String,
    val imageUrl: String
)

val CategoriyList= listOf(
    Category("Fast Food", "https://example.com/fastfood.png"),
    Category("Chinese", "https://example.com/chinese.png"),
    Category("Italian", "https://example.com/italian.png"),
    Category("Mexican", "https://example.com/mexican.png"),
    Category("Desserts", "https://example.com/desserts.png")
)