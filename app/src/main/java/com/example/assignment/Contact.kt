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

@Composable
fun Contact() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column (modifier = Modifier
            .fillMaxSize()
            .background(SBLightGreen)
            .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Contact", fontSize = 30.sp)
            Spacer(modifier = Modifier.height(64.dp))
            Text(text = "South Eastern Region College", fontSize = 16.sp)
            Text(text = "Castle Park Road", fontSize = 16.sp)
            Text(text = "Bangor", fontSize = 16.sp)
            Text(text = "BT20 4TD", fontSize = 16.sp)
            Spacer(modifier = Modifier.height(64.dp))
            Text(text = "Phone: 03456007555", fontSize = 16.sp)
            Text(text = "Email: info@serc.ac.uk", fontSize = 16.sp)
            Spacer(modifier = Modifier.height(64.dp))

            Image(
                painter = painterResource(id = R.drawable.assignmentmap),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(300.dp, 300.dp)
                    .padding(vertical = 8.dp)
            )



        }
    }
}
@Preview
@Composable
fun ContactPreview() {
    Contact()
}