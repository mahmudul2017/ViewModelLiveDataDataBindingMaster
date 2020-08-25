package com.example.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemo.viewModel.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         // var count = 0

        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)

       tv_digit.text = viewModel.count.toString()

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
