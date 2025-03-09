package com.example.dchagoyafoodapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.dchagoyafoodapp.models.Category

@Composable
fun CategoryCard(category: Category) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color.Red, shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            AsyncImage(
                model = category.imageUrl,
                contentDescription = category.name,
                modifier = Modifier.size(60.dp)
            ) // fin asyncimage
        } // fin box

        Text(text = category.name, fontSize = 14.sp) // fin text
    } // fin column
}



@Composable
@Preview()
fun PreviewCategoryCard() {
    CategoryCard(category = Category(name = "Fast Food", imageUrl = "https://cdn-icons-png.flaticon.com/512/3703/3703377.png"))
}