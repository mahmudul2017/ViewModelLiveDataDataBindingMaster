package com.example.viewmodeldemo.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel(name: String) : ViewModel() {

    val TAG = "MyViewModel"

    val textName: String = name
    var count = 0
  //  var count = MutableLiveData<Int>()

    fun numberIncrement() {
        count++   //count.setValue = count.getValue + 1
    }

    fun numberDecrement() {
        count--
    }

    init {
        Log.d(TAG, textName)
        count = 0
    }

    override fun onCleared() {
        super.onCleared()
    }
}