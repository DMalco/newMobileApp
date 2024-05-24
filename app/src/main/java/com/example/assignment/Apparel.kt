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

// Function to display the Apparel screen
@Composable
fun Apparel() {
    // Column layout to arrange items vertically
    Column(
        modifier = Modifier
            .fillMaxSize() // Fill the entire screen
            .background(SBLightGreen) // Set background color
            .padding(16.dp), // Padding around the content
        verticalArrangement = Arrangement.Center, // Center content vertically
        horizontalAlignment = Alignment.CenterHorizontally // Center content horizontally
    ) {
        // Title text
        Text(text = "Catalogue", fontSize = 30.sp, color = Color.Black)
        // Subtitle text
        Text(text = "Our current stock", fontSize = 16.sp, color = Color.Black)
        // Spacer to add some space
        Spacer(modifier = Modifier.height(64.dp))
        // Call function to display image slider
        SampleImageSlider()
    }
}

// Function to display a slider of images
@Composable
fun ImageSlider(imageList: List<Int>, modifier: Modifier = Modifier) {
    // Horizontal list to display images
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp), // Space between images
        verticalAlignment = Alignment.CenterVertically // Center images vertically
    ) {
        // Iterate over image list and display each image
        items(imageList) { imageResId ->
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                contentScale = ContentScale.Crop, // Crop the image to fit
                modifier = Modifier
                    .size(400.dp, 400.dp) // Set image size
                    .padding(vertical = 8.dp) // Padding around each image
            )
        }
    }
}

// Function to provide a sample list of images for the slider
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
    // Call ImageSlider function with the sample list
    ImageSlider(imageList = imageList)
}

// Preview function to display the Apparel composable in Android Studio
@Preview
@Composable
fun ApparelPreview() {
    Apparel()
}