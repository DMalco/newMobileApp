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

// Function to display the help information screen
@Composable
fun Help() {
    // Box layout to contain other elements
    Box(modifier = Modifier.fillMaxSize()) {
        // Column layout to arrange items vertically
        Column(
            modifier = Modifier
                .fillMaxSize() // Fill the entire screen
                .background(SBLightGreen) // Set background color
                .align(Alignment.Center) // Center the column within the box
                .padding(all = 20.dp), // Add padding around the column
            verticalArrangement = Arrangement.Center, // Center content vertically
            horizontalAlignment = Alignment.CenterHorizontally // Center content horizontally
        ) {
            // Title text
            Text(text = "Help", fontSize = 30.sp)
            // Spacer to add space
            Spacer(modifier = Modifier.height(64.dp))
            // Information text about the campaign
            Text(
                text = "One way that we are doing our bit is with the Suited and Booted campaign," +
                        " which aims to reduce the amount of fast fashion " +
                        "produced while providing students with clothes for interviews and work. " +
                        "Fast fashion has negative impacts on the environment such as water pollution," +
                        " the use of toxic chemicals and increasing levels of textile waste, which typically" +
                        " ends up in landfill when we no longer want the clothes we rushed out to buy!",
                fontSize = 16.sp
            )
            // Spacer to add space
            Spacer(modifier = Modifier.height(32.dp))
            // Additional information text about the campaign
            Text(
                text = "Instead of buying something new that you may only wear once or" +
                        " twice, why not check out our Suited and Booted shop?! You can pick" +
                        " up something free of charge if you are a student. If you’re a staff" +
                        " member and you have your eye on something in the Suited and Booted" +
                        " shop, we also run a token scheme: for every five items you donate " +
                        "you can choose something to take home!",
                fontSize = 16.sp
            )
            // Spacer to add space
            Spacer(modifier = Modifier.height(64.dp))
            // Image for the SERC logo
            Image(
                painter = painterResource(id = R.drawable.serclogo),
                contentDescription = null,
                contentScale = ContentScale.Crop, // Crop the image to fit
                modifier = Modifier
                    .size(200.dp, 75.dp) // Set image size
                    .padding(vertical = 8.dp) // Padding around the image
            )
        }
    }
}

// Preview function to display the Help composable in Android Studio
@Preview
@Composable
fun HelpPreview() {
    Help()
}
