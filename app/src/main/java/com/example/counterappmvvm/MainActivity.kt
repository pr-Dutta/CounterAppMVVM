package com.example.counterappmvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.counterappmvvm.ui.theme.CounterAppMVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterAppMVVMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val counterViewModelInstance: CounterViewModel = viewModel()

                    CounterApp(counterViewModel = counterViewModelInstance)
                }
            }
        }
    }
}

@Composable
fun CounterApp(counterViewModel: CounterViewModel) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Counter Value : ${counterViewModel.count.value}",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.padding(16.dp))

        Row {
            Button(onClick = {
                counterViewModel.increment()
            }) {
                Text(text = "Increment")
            }

            Spacer(modifier = Modifier.padding(16.dp))
            Button(onClick = {
                counterViewModel.decrement()
            }) {
                Text(text = "Decrement")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CounterAppMVVMTheme {
        //
    }
}