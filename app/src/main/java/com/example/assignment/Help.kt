package com.example.assignment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.assignment.ui.theme.SBLightGreen

@Composable
fun Help() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column (modifier = Modifier
            .fillMaxSize()
            .background(SBLightGreen)
            .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Help", fontSize = 30.sp)
            Text(text = "Here's some helpful information about the app", fontSize = 16.sp)
        }
    }
}
@Preview
@Composable
fun HelpPreview() {
    Help()
}