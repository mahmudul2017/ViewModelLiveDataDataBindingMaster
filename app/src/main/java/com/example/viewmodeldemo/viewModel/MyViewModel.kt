package com.example.viewmodeldemo.viewModel

import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {

    var count = 0

    fun numberIncrement() {
        count++
    }

    fun numberDecrement() {
        count--
    }
}