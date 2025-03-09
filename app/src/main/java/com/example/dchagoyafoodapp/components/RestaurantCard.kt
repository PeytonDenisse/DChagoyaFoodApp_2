package com.example.dchagoyafoodapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.dchagoyafoodapp.models.Restaurant


@Composable
fun RestaurantCard(restaurant: Restaurant) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AsyncImage(
            model = restaurant.imageUrl,
            contentDescription = restaurant.name,
            modifier = Modifier.size(60.dp)
        ) // fin asyncimage

        Text(text = restaurant.name, fontSize = 14.sp) // fin text
    } // fin column
}


@Composable
@Preview()
fun PreviewRestaurantCard() {
    RestaurantCard(restaurant = Restaurant(name = "Wendy's", imageUrl = "https://cdn-icons-png.flaticon.com/512/3703/3703377.png"))
}