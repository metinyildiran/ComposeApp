package com.example.composeapp.ui.counter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun CounterScreen(viewModel: CounterViewModel = hiltViewModel()) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Clicked: ${viewModel.clickCount.value} times")

        Button(onClick = {
            viewModel.increaseClickCount()
        }) {
            Text(text = "Click Me")
        }
    }
}
