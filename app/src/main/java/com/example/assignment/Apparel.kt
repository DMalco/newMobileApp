package com.example.assignment


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment.ui.theme.SBLightGreen


@Composable
fun Apparel() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(SBLightGreen)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Catalogue", fontSize = 30.sp, color = Color.Black)
        Text(text = "Our current stock", fontSize = 16.sp, color = Color.Black)
        Spacer(modifier = Modifier.height(64.dp))
        SampleImageSlider()



    }
}

@Composable
fun ImageSlider(imageList: List<Int>, modifier: Modifier = Modifier) {
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        items(imageList) { imageResId ->
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(400.dp, 400.dp)
                    .padding(vertical = 8.dp)
            )
        }
    }
}

@Composable
fun SampleImageSlider() {
    val imageList = listOf(

        R.drawable.dressshirt,
        R.drawable.pngegg,
        R.drawable.suit,
        R.drawable.suit2,
        R.drawable.wblouse,
        R.drawable.wreblouse,
        R.drawable.wsuit

        )
    ImageSlider(imageList = imageList)
}

@Preview
@Composable
fun ApparelPreview() {
    Apparel()
}
//save