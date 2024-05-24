package com.example.assignment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.example.assignment.R
import com.example.assignment.ui.theme.SBLightGreen
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

// Function to display the booking confirmation screen
@Composable
fun BookingConfirm() {
    // Box layout to contain other elements
    Box(modifier = Modifier.fillMaxSize()) {
        // Column layout to arrange items vertically
        Column(
            modifier = Modifier
                .fillMaxSize() // Fill the entire screen
                .background(SBLightGreen) // Set background color
                .align(Alignment.Center), // Center the column within the box
            verticalArrangement = Arrangement.Center, // Center content vertically
            horizontalAlignment = Alignment.CenterHorizontally // Center content horizontally
        ) {
            // Title text
            Text(text = "Booking Confirmation", fontSize = 30.sp, color = Color.Black)
            // Spacer to add space
            Spacer(modifier = Modifier.height(64.dp))
            // Confirmation message text
            Text(text = "Your booking is confirmed!", fontSize = 16.sp, color = Color.Black)
            // Image for the confirmation tick
            Image(
                painter = painterResource(id = R.drawable.tick),
                contentDescription = null,
                contentScale = ContentScale.Crop, // Crop the image to fit
                modifier = Modifier
                    .size(350.dp, 300.dp) // Set image size
                    .padding(vertical = 8.dp) // Padding around the image
            )
        }
    }
}

// Preview function to display the BookingConfirm composable in Android Studio
@Preview
@Composable
fun BookingConfirmPreview() {
    BookingConfirm()
}
