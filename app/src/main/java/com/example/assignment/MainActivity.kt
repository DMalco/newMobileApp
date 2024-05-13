package com.example.assignment



import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Help
import androidx.compose.material.icons.filled.Login
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.ExpandCircleDown
import androidx.compose.material.icons.outlined.HelpOutline
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.ShoppingBag
import androidx.compose.material.icons.rounded.Help
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.ShoppingBag
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.assignment.ui.theme.NavappTheme
import com.example.assignment.ui.theme.SBLightGreen
import com.example.assignment.ui.theme.SBOffWhite


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    //color = MaterialTheme.colorScheme.background
                ) {

                    BottomAppBar()

                }
            }
        }
    }
}


/***   Bottom Bar   ***/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomAppBar() {

    val navigationController = rememberNavController()
    val context = LocalContext.current.applicationContext
    val selected = remember {
        mutableStateOf(Icons.Rounded.Home)
    }

    val sheetState = rememberModalBottomSheetState()
    var showBottomSheet by remember {
        mutableStateOf(false)
    }


    Scaffold(
        bottomBar = {
            androidx.compose.material3.BottomAppBar(
                containerColor = SBOffWhite

            ) {
                Row( // Wrap in a Row for horizontal placement
                    modifier = Modifier.weight(1f) // Divide weight equally

                ) {
                    Column( // Stack icon and text vertically
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                            .height(42.dp)
                    ) {
                        CompositionLocalProvider(LocalContentColor provides Color.Black) {
                            IconButton(
                                onClick = {
                                    selected.value = Icons.Rounded.Home
                                    navigationController.navigate(Screens.Home.screen) {
                                        popUpTo(0)
                                    }
                                }

                            ) {
                                Icon(
                                    imageVector = if (selected.value == Icons.Rounded.Home) {
                                        Icons.Rounded.Home
                                    } else {
                                        Icons.Outlined.Home // Change to the outline version when not selected
                                    },
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp)


                                )
                            }
                            Text( // Add Text for the title
                                text = "Home",
                                fontSize = 12.sp,
                                modifier = Modifier.padding(start = 1.dp)
                                // Add padding for spacing
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.weight(1f))


                Row( // Wrap in a Row for horizontal placement
                    modifier = Modifier.weight(1.5f) // Divide weight equally

                ) {
                    Column( // Stack icon and text vertically
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                            .height(42.dp)
                    ) {
                        CompositionLocalProvider(LocalContentColor provides Color.Black) {
                            IconButton(
                                onClick = {
                                    selected.value = Icons.Rounded.ShoppingBag
                                    navigationController.navigate(Screens.Apparel.screen) {
                                        popUpTo(0)
                                    }
                                }
                            ) {
                                Icon(
                                    imageVector = if (selected.value == Icons.Rounded.ShoppingBag) {
                                        Icons.Rounded.ShoppingBag
                                    } else {
                                        Icons.Outlined.ShoppingBag // Change to the outline version when not selected
                                    },
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp),
                                )
                            }
                            Text( // Add Text for the title
                                text = "Apparel",
                                fontSize = 12.sp,
                                modifier = Modifier.padding(start = 1.dp) // Add padding for spacing
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.weight(1f)) // Add Spacer between items


                Row( // Wrap in a Row for horizontal placement
                    modifier = Modifier.weight(1.5f) // Divide weight equally

                ) {
                    Column( // Stack icon and text vertically
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                            .height(42.dp)
                    ) {
                        CompositionLocalProvider(LocalContentColor provides Color.Black) {
                            IconButton(
                                onClick = { showBottomSheet = true }) {
                                Icon(
                                    Icons.Outlined.ExpandCircleDown,
                                    contentDescription = null,
                                    tint = Color.Black
                                )
                            }
                        }

                        Text( // Add Text for the title
                            text = "More",
                            color = Color.Black,
                            fontSize = 12.sp,
                            modifier = Modifier.padding(start = 1.dp) // Add padding for spacing
                        )
                    }
                }


                Spacer(modifier = Modifier.weight(1f)) // Add Spacer between items

                Row( // Wrap in a Row for horizontal placement
                    modifier = Modifier.weight(1f) // Divide weight equally
                ) {
                    Column( // Stack icon and text vertically
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                            .height(42.dp)
                    ) {
                        CompositionLocalProvider(LocalContentColor provides Color.Black) {
                            IconButton(
                                onClick = {
                                    selected.value = Icons.Filled.Help
                                    navigationController.navigate(Screens.Help.screen) {
                                        popUpTo(0)
                                    }
                                }
                            ) {
                                Icon(
                                    imageVector = if (selected.value == Icons.Filled.Help) {
                                        Icons.Rounded.Help
                                    } else {
                                        Icons.Outlined.HelpOutline // Change to the outline version when not selected
                                    },
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp),
                                )
                            }
                            Text( // Add Text for the title
                                text = "Help",
                                fontSize = 12.sp,
                                modifier = Modifier.padding(start = 1.dp) // Add padding for spacing
                            )
                        }

                    }
                }

// Close the Column for the second button
// Close the Row for horizontal placement


                Spacer(modifier = Modifier.weight(1f)) // Add Spacer between items
                Row( // Wrap in a Row for horizontal placement
                    modifier = Modifier.weight(1.5f) // Divide weight equally

                ) {
                    Column( // Stack icon and text vertically
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        CompositionLocalProvider(LocalContentColor provides Color.Black) {
                            IconButton(
                                onClick = {
                                    selected.value = Icons.Default.Mail
                                    navigationController.navigate(Screens.Contact.screen) {
                                        popUpTo(0)
                                    }
                                }
                            ) {
                                Icon(
                                    imageVector = if (selected.value == Icons.Filled.Mail) {
                                        Icons.Filled.Mail
                                    } else {
                                        Icons.Outlined.Mail // Change to the outline version when not selected
                                    },
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp),
                                )
                            }

                            Text( // Add Text for the title
                                text = "Contact",
                                fontSize = 12.sp,
                                modifier = Modifier.padding(start = 1.dp) // Add padding for spacing
                            )
                        }

                    }
                }


            }


        }

    ) { paddingValues ->
        NavHost(
            navController = navigationController,
            startDestination = Screens.Home.screen,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(Screens.Home.screen) { Home() }
            composable(Screens.Apparel.screen) { Apparel() }
            composable(Screens.Help.screen) { Help() }
            composable(Screens.Contact.screen) { Contact() }
            composable(Screens.Cart.screen) { Cart() }
            composable(Screens.BookingConfirm.screen) { BookingConfirm() }
            composable(Screens.Booking.screen) {
                Booking(navController = navigationController)
            }
        }

    }

    if (showBottomSheet){
        ModalBottomSheet(onDismissRequest = { showBottomSheet = false },
            sheetState = sheetState
        ) {
            Column (modifier = Modifier
                .fillMaxWidth()
                .background(SBOffWhite)
                .padding(18.dp),
                verticalArrangement = Arrangement.spacedBy(28.dp)
            ){
                BottomSheetItem(icon = Icons.Filled.ShoppingCart, title = "Cart") {
                    showBottomSheet = false
                    navigationController.navigate(Screens.Cart.screen){
                        popUpTo(0)
                    }
                }
                BottomSheetItem(icon = Icons.Filled.Schedule, title = "Make a Booking"){
                    showBottomSheet = false
                    navigationController.navigate(Screens.Booking.screen){
                        popUpTo(0)
                    }
                }
                BottomSheetItem(icon = Icons.Default.Login, title = "Login") {
                    Toast.makeText(context, "Login", Toast.LENGTH_SHORT).show()
                }
                BottomSheetItem(icon = Icons.Default.Logout, title = "Logout") {
                    Toast.makeText(context, "Logout", Toast.LENGTH_SHORT).show()
                }
                BottomSheetItem(icon = Icons.Default.Edit, title = "Register") {
                    Toast.makeText(context, "Register", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}

@Composable
fun BottomSheetItem(icon: ImageVector, title: String, onClick: () -> Unit){
    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.clickable { onClick() }
    ) {
        Icon(icon, contentDescription = null, tint = SBLightGreen)
        Text(text = title, color = Color.Black, fontSize = 22.sp)
    }

}


@Preview
@Composable
fun BottomAppBarPreview() {
    NavappTheme {

        BottomAppBar()

    }
}
