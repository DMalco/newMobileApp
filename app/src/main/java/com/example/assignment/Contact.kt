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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment.ui.theme.SBLightGreen

// Function to display the contact information screen
@Composable
fun Contact() {
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
            Text(text = "Contact", fontSize = 30.sp)
            // Spacer to add space
            Spacer(modifier = Modifier.height(64.dp))
            // Address information
            Text(text = "South Eastern Region College", fontSize = 16.sp)
            Text(text = "Castle Park Road", fontSize = 16.sp)
            Text(text = "Bangor", fontSize = 16.sp)
            Text(text = "BT20 4TD", fontSize = 16.sp)
            // Spacer to add space
            Spacer(modifier = Modifier.height(64.dp))
            // Contact information
            Text(text = "Phone: 03456007555", fontSize = 16.sp)
            Text(text = "Email: info@serc.ac.uk", fontSize = 16.sp)
            // Spacer to add space
            Spacer(modifier = Modifier.height(64.dp))
            // Image for the map
            Image(
                painter = painterResource(id = R.drawable.assignmentmap),
                contentDescription = null,
                contentScale = ContentScale.Crop, // Crop the image to fit
                modifier = Modifier
                    .size(300.dp, 300.dp) // Set image size
                    .padding(vertical = 8.dp) // Padding around the image
            )
        }
    }
}

// Preview function to display the Contact composable in Android Studio
@Preview
@Composable
fun ContactPreview() {
    Contact()
}
