package com.pmtaller2.MiriamDonas_00022423.ui.screens.Search

import RestaurantItem
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pmtaller2.MiriamDonas_00022423.data.dummy.dummyRestaurants
import androidx.compose.foundation.lazy.items



@Composable
fun SearchScreen(
    onRestaurantClick: (Int) -> Unit
) {
    val allRestaurants = dummyRestaurants
    var query by rememberSaveable { mutableStateOf("") }

    val matchedRestaurants = remember(query) {
        allRestaurants.filter { restaurant ->
            val lowerQuery = query.lowercase()
            restaurant.name.lowercase().contains(lowerQuery) ||
                    restaurant.categories.any { it.lowercase().contains(lowerQuery) } ||
                    restaurant.menu.any { dish -> dish.name.lowercase().contains(lowerQuery) }
        }
    }

    Column(modifier = Modifier.padding(16.dp)) {
        OutlinedTextField(
            value = query,
            onValueChange = { query = it },
            label = { Text("Buscar") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(matchedRestaurants) { restaurant ->
                RestaurantItem(
                    restaurant = restaurant,
                    onRestaurantClick = { onRestaurantClick(restaurant.id) }
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}


