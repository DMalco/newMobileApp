package com.example.assignment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
/*import androidx.compose.foundation.layout.ColumnScopeInstance.align
import androidx.compose.foundation.layout.FlowColumnScopeInstance.align*/

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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Booking(navController: NavHostController) {
    var selectedDate by remember { mutableStateOf("") }
    var selectedTime by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Make a Booking",
                        fontSize = 32.sp,
                        color = Color.Black,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center // Align the text centrally
                    )
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = SBLightGreen // Change background color to SBLightGreen
                )
            )
        },
        content = { contentPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(SBLightGreen)
                    .padding(
                        horizontal = 16.dp,
                        vertical = contentPadding.calculateBottomPadding()
                    ),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)

            ) {
                // Date selection or what ever text you want here
                Text("Make a Booking", fontSize = 32.sp, color = Color.Black)

                Spacer(modifier = Modifier.height(64.dp))
                OutlinedTextField(
                    value = selectedDate,
                    onValueChange = { selectedDate = it },
                    label = { Text("Select Date") },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(SBLightGreen)
                        .align(Alignment.CenterHorizontally)
                )

                // Time selection
                OutlinedTextField(
                    value = selectedTime,
                    onValueChange = { selectedTime = it },
                    label = { Text("Select Time") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()


                )
                Spacer(modifier = Modifier.height(32.dp))

                // Image and Text Row
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Image
                    Image(
                        painter = painterResource(id = R.drawable.calendericon),
                        contentDescription = null, // content description
                        modifier = Modifier.size(200.dp)
                    )

                    // Text
                    /*   Text(
                           text = "Your text here",
                           modifier = Modifier.padding(start = 8.dp)
                       )*/
                }
                Spacer(modifier = Modifier.height(32.dp))

                // Booking Button
                Button(
                    onClick = { navController.navigate(Screens.BookingConfirm.screen)},
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Black
                    )

                ) {
                    Text("Book Appointment")
                }
            }
        }
    )
}


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