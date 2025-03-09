package com.example.dchagoyafoodapp.models

data class Restaurant(
    val name: String,
    val imageUrl: String
)

val RestaurantsList = listOf(
    Restaurant("Burger King", "https://static.vecteezy.com/system/resources/previews/019/909/686/non_2x/burger-king-transparent-burger-king-free-free-png.png"),
    Restaurant("Sushi Roll", "https://lh5.googleusercontent.com/proxy/JAZk8puv_0uoNRZgMNiEXouGHpA-FcOscKUaGQDyt_gVtD_wvcYMEebdEJ9VkG2qoser39crrGph4HE31idV_whaRZM"),
    Restaurant("Wendy's", "https://www.wendys.com/themes/custom/wendys_main/dist/img/headband-wendy.png"),
    Restaurant("Pizza Hut", "https://www.freepnglogos.com/uploads/pizza-hut-png-logo/pizza-hut-brands-png-logo-8.png"),
    Restaurant("Casa Di Italia", "https://menufyproduction.imgix.net/638738612689875011+1663689.png?auto=compress,format&fit=max&w=1024&h=1024")
)