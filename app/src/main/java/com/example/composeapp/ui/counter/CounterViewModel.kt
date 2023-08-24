package com.example.composeapp.ui.counter

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CounterViewModel @Inject constructor() : ViewModel() {
    val clickCount = mutableStateOf(0)

    fun increaseClickCount() {
        clickCount.value += 1
    }
}