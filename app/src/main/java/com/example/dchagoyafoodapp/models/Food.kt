package com.example.dchagoyafoodapp.models

data class Food(
    val name: String,
    val imageUrl: String,
    val rating: Double,
    val price: Double
)


val FoodList = listOf(
    Food("Pizza Margarita", "https://png.pngtree.com/png-clipart/20230524/original/pngtree-pizza-italian-png-image_9169062.png", 4.5, 199.8),
    Food("Spagetti Boloñesa", "https://png.pngtree.com/png-clipart/20240320/original/pngtree-spaghetti-italian-pasta-with-tomato-sauce-png-image_14637602.png", 4.3, 159.8),
    Food("Lassagna", "https://static.vecteezy.com/system/resources/thumbnails/026/757/641/small/lasagna-with-ai-generated-free-png.png", 4.6, 179.8),
    Food("Tiramisú", "https://static.vecteezy.com/system/resources/previews/046/601/086/non_2x/tiramisu-classic-italian-with-mascarpone-and-espresso-soaked-ladyfingers-served-in-a-transparent-glass-dish-png.png", 4.7, 149.8),
    Food("Gelato", "https://www.thegelatist.it/wp-content/uploads/2018/02/coppetta.png", 4.8, 129.9)
)
