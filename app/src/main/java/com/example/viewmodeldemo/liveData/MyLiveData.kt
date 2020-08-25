package com.example.viewmodeldemo.liveData

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyLiveData: ViewModel() {
    val TAG = "MyViewModel"

    //  var count = 0
    var count = MutableLiveData<Int>()

    fun numberIncrement() {
        count!!.value = count!!.value!! + 1   //count.setValue = count.getValue + 1
    }

    fun numberDecrement() {
        count!!.value = count!!.value!! - 1
    }

    init {
        count?.value = 0
    }

    override fun onCleared() {
        super.onCleared()
    }
}
