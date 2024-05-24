package com.example.assignment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment.ui.theme.SBLightGreen
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavHostController

val SBOffWhite = Color(0xffffaf7f0)

// Function to display the booking screen
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Booking(navController: NavHostController) {
    var selectedDate by remember { mutableStateOf("") } // State to hold selected date
    var selectedTime by remember { mutableStateOf("") } // State to hold selected time

    Scaffold(
        topBar = {
            // Top app bar with title
            TopAppBar(
                title = {
                    Text(
                        "Make a Booking",
                        fontSize = 32.sp,
                        color = Color.Black,
                        modifier = Modifier.fillMaxWidth(), // Fill the width of the screen
                        textAlign = TextAlign.Center // Center the title text
                    )
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = SBLightGreen // Background color of the app bar
                )
            )
        },
        content = { contentPadding ->
            // Column layout for the booking form
            Column(
                modifier = Modifier
                    .fillMaxSize() // Fill the entire screen
                    .background(SBLightGreen) // Set background color
                    .padding(
                        horizontal = 16.dp,
                        vertical = contentPadding.calculateBottomPadding()
                    ),
                horizontalAlignment = Alignment.CenterHorizontally, // Center content horizontally
                verticalArrangement = Arrangement.spacedBy(16.dp) // Space between items
            ) {
                // Title text
                Text("Make a Booking", fontSize = 32.sp, color = Color.Black)

                Spacer(modifier = Modifier.height(64.dp)) // Spacer to add space
                // Text field for selecting date
                OutlinedTextField(
                    value = selectedDate,
                    onValueChange = { selectedDate = it },
                    label = { Text("Select Date") },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth() // Fill the width of the screen
                        .background(SBLightGreen)
                        .align(Alignment.CenterHorizontally)
                )

                // Text field for selecting time
                OutlinedTextField(
                    value = selectedTime,
                    onValueChange = { selectedTime = it },
                    label = { Text("Select Time") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth() // Fill the width of the screen
                )
                Spacer(modifier = Modifier.height(32.dp)) // Spacer to add space

                // Row layout to display the image
                Row(
                    modifier = Modifier.fillMaxWidth(), // Fill the width of the screen
                    horizontalArrangement = Arrangement.SpaceEvenly, // Space items evenly
                    verticalAlignment = Alignment.CenterVertically // Center items vertically
                ) {
                    // Image for the calendar icon
                    Image(
                        painter = painterResource(id = R.drawable.calendericon),
                        contentDescription = null,
                        modifier = Modifier.size(200.dp) // Set image size
                    )
                }
                Spacer(modifier = Modifier.height(32.dp)) // Spacer to add space

                // Button to confirm booking
                Button(
                    onClick = { navController.navigate(Screens.BookingConfirm.screen) },
                    modifier = Modifier.fillMaxWidth(), // Fill the width of the screen
                    colors = ButtonDefaults.buttonColors(
                        containerColor = SBOffWhite, // Button background color
                        contentColor = Color.Black // Button text color
                    )
                ) {
                    Text("Book Appointment")
                }
            }
        }
    )
}

// Preview function to display the Booking composable in Android Studio
@Preview
@Composable
fun BookingPreview() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "booking") {
        composable(route = "booking") {
            Booking(navController = navController)
        }
    }
}