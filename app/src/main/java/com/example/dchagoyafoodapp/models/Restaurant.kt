package com.example.dchagoyafoodapp.models

data class Restaurant(
    val name: String,
    val imageUrl: String
)

val RestaurantsList = listOf(
    Restaurant("Burger King", "https://static.vecteezy.com/system/resources/previews/019/909/686/non_2x/burger-king-transparent-burger-king-free-free-png.png"),
    Restaurant("Wendy's", "https://www.wendys.com/themes/custom/wendys_main/dist/img/headband-wendy.png"),
    Restaurant("Pizza Hut", "https://www.freepnglogos.com/uploads/pizza-hut-png-logo/pizza-hut-brands-png-logo-8.png"),
    Restaurant("Fenotti", "https://images.rappi.com.mx/restaurants_logo/9599be45-63a7-4ed7-bb6b-7fc170571b30-1722910991156.png?e=webp&d=10x10&q=10"),
    Restaurant("Sushi Roll", "https://lh5.googleusercontent.com/proxy/JAZk8puv_0uoNRZgMNiEXouGHpA-FcOscKUaGQDyt_gVtD_wvcYMEebdEJ9VkG2qoser39crrGph4HE31idV_whaRZM"),
    Restaurant("Dairy Queen ", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Dairy_Queen_logo.svg/1200px-Dairy_Queen_logo.svg.png"),

    )