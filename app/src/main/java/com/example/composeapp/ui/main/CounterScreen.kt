package com.example.composeapp.ui.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CounterScreen(viewModel: MainViewModel = hiltViewModel()) {
    val emailValue = rememberSaveable { mutableStateOf("") }
    var passwordValue by rememberSaveable { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Clicked: ${viewModel.clickCount.value} times")

        Button(onClick = {
            viewModel.increaseClickCount()
        }) {
            Text(text = "Click Me")
        }

        TextField(modifier = Modifier.fillMaxWidth(), value = emailValue.value, onValueChange = {
            emailValue.value = it
        }, maxLines = 1)

        TextField(value = passwordValue, onValueChange = {
            passwordValue = it
        })
    }
}
