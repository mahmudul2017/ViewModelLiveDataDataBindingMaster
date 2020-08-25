package com.example.viewmodeldemo.viewModel

import androidx.lifecycle.ViewModel

class MyViewModel(name: String): ViewModel() {

    val textName: String = name
    var count = 0

    fun numberIncrement() {
        count++
    }

    fun numberDecrement() {
        count--
    }

    /*init {

    }*/
}