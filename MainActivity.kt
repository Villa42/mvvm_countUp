package com.work.ss.mvvm_countup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*


class MainActivity : ComponentActivity() {

    private val viewModel: CountViewModel by viewModels<CountViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CountUp(viewModel = viewModel)
        }
    }
}

//@Composable
//fun CountUp() {
//    //var count: Int = 0
//    var count: Int by remember {
//        mutableStateOf(0)
//    }
//
//    Column() {
//        Text(text = "$count")
//        Button(onClick = { count += 1 }
//        ) {
//            Text(text = "Count Up!")
//        }
//    }
//}

@Composable
fun CountUp(viewModel: CountViewModel) {
    //var count: Int = 0
    var count: Int by viewModel.count

    Column() {
        Text(text = "$count")
        Button(onClick = {
            viewModel.OnCountUpTapped()
        }
        ) {
            Text(text = "Count Up!")
        }
    }
}