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
fun Help() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column (modifier = Modifier
            .fillMaxSize()
            .background(SBLightGreen)
            .align(Alignment.Center)
            .padding(all = 20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Help", fontSize = 30.sp)
            Spacer(modifier = Modifier.height(64.dp))
            Text(text = "One way that we are doing our bit is with the Suited and Booted campaign," +
                    " which aims to reduce the amount of fast fashion " +
                    "produced while providing students with clothes for interviews and work. " +
                    "Fast fashion has negative impacts on the environment such as water pollution," +
                    " the use of toxic chemicals and increasing levels of textile waste, which typically" +
                    " ends up in landfill when we no longer want the clothes we rushed out to buy!",
                fontSize = 16.sp)
            Spacer(modifier = Modifier.height(32.dp))
            Text(text = "Instead of buying something new that you may only wear once or" +
                    " twice, why not check out our Suited and Booted shop?! You can pick" +
                    " up something free of charge if you are a student. If you’re a staff" +
                    " member and you have your eye on something in the Suited and Booted" +
                    " shop, we also run a token scheme: for every five items you donate " +
                    "you can choose something to take home!",
                fontSize = 16.sp)
            Spacer(modifier = Modifier.height(64.dp))

            Image(
                painter = painterResource(id = R.drawable.serclogo),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp, 75.dp)
                    .padding(vertical = 8.dp)
            )

        }
    }
}
@Preview
@Composable
fun HelpPreview() {
    Help()
}