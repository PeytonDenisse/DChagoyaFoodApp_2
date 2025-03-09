package com.example.dchagoyafoodapp.models

data class Food(
    val name: String,
    val imageUrl: String,
    val rating: Double,
    val price: Double
)


val FoodList = listOf(
    Food("Pizza Margarita", "https://motopizzagiovanni.com/images/bg_1.png", 4.5, 199.8),
    Food("Spagetti Boloñesa", "https://png.pngtree.com/png-clipart/20240320/original/pngtree-spaghetti-italian-pasta-with-tomato-sauce-png-image_14637602.png", 4.3, 159.8),
    Food("Lassagna", "https://static.vecteezy.com/system/resources/thumbnails/026/757/641/small/lasagna-with-ai-generated-free-png.png", 4.6, 179.8),
    Food("Tiramisú", "https://png.pngtree.com/png-vector/20240520/ourmid/pngtree-selectable-tiramisu-dessert-in-a-glass-png-image_12498281.png", 4.7, 149.8),
    Food("Gelato", "https://www.thegelatist.it/wp-content/uploads/2018/02/coppetta.png", 4.8, 129.9)
)
