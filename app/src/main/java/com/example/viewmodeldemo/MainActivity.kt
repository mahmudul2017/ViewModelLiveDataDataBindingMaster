package com.example.viewmodeldemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemo.viewModel.MyViewModel
import com.example.viewmodeldemo.viewModel.MyViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // var count = 0
        val viewModelFactory = MyViewModelFactory("Mahmudul Hasan")
        viewModel = ViewModelProvider(this, viewModelFactory).get(MyViewModel::class.java)

        tv_digit.text = viewModel.count.toString()
        tv_name.text = "created by: " + viewModelFactory.itemName.toString()

        btn_add.setOnClickListener() {
            //   count++
            //   val increment = viewModel.numberIncrement()
            viewModel.numberIncrement()
            tv_digit.text = viewModel.count.toString()
        }

        btn_minus.setOnClickListener() {
            //   count--
            //   val decrement = viewModel.numberDecrement()
            viewModel.numberDecrement()
            tv_digit.text = viewModel.count.toString()
        }
    }
}
