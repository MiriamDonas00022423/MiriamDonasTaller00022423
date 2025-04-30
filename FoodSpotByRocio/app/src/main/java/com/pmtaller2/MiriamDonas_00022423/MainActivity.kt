package com.pmtaller2.MiriamDonas_00022423


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pmtaller2.MiriamDonas_00022423.data.dummy.dummyRestaurants
import com.pmtaller2.MiriamDonas_00022423.data.model.Dish
import com.pmtaller2.MiriamDonas_00022423.data.model.Restaurant
import com.pmtaller2.MiriamDonas_00022423.ui.layout.CustomScaffold
import com.pmtaller2.MiriamDonas_00022423.ui.theme.FoodSpotByRocioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpotByRocioTheme {
                CustomScaffold()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FoodSpotByRocioTheme {
        Greeting("Android")
    }
}