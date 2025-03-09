package com.example.dchagoyafoodapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dchagoyafoodapp.components.CategoryCard
import com.example.dchagoyafoodapp.components.FoodCard
import com.example.dchagoyafoodapp.components.RestaurantCard
import com.example.dchagoyafoodapp.models.CategoriyList
import com.example.dchagoyafoodapp.models.FoodList
import com.example.dchagoyafoodapp.models.RestaurantsList
import com.example.dchagoyafoodapp.utils.Logout


@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(imageVector = Icons.Default.Person, contentDescription = "Usuario")
            // fin icon
            Text(text = "Hola, Peyton ", style = MaterialTheme.typography.headlineLarge)
            // fin text
            Image(imageVector = Logout, contentDescription = "Cerrar sesión") // fin icon
            // fin iconbutton
        } // fin row

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Nuestras categorías",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(start = 16.dp, top = 8.dp)
        ) // fin text
        Spacer(modifier = Modifier.height(12.dp))

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(CategoriyList) { category ->
                CategoryCard(category)
            } // fin items
        } // fin lazyrow

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Busca los mejores restaurantes",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(start = 16.dp, top = 16.dp)
        ) // fin text

        Spacer(modifier = Modifier.height(12.dp))

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(RestaurantsList) { restaurant ->
                RestaurantCard(restaurant)
            } // fin items
        } // fin lazyrow

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Nuestras mejores comidas",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(start = 16.dp, top = 16.dp)
        ) // fin text

        Spacer(modifier = Modifier.height(12.dp))

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(16.dp)
        ) {
            items(FoodList) { food ->
                FoodCard(food)
            } // fin items
        } // fin lazyverticalgrid


    } // fin column
}

@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
} // fin preview