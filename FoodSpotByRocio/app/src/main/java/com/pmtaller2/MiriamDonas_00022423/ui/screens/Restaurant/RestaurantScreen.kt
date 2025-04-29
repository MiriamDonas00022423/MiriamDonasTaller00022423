import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pmtaller2.MiriamDonas_00022423.data.model.Restaurant


@Composable
fun RestaurantListScreen(
    onRestaurantClick: (Int) -> Unit = {}
) {
    val restaurantsByCategory: Map<String, List<Restaurant>> =
        restaurants
            .flatMap { restaurant ->
                restaurant.categories.map { category -> category to restaurant }
            }
            .groupBy({ it.first }, { it.second })

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        restaurantsByCategory.forEach { (category, restaurantList) ->
            item {
                Text(
                    text = category,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }

            item {
                LazyRow {
                    items(restaurantList) { restaurant ->
                        RestaurantItem(restaurant = restaurant, onClick = { onRestaurantClick(restaurant.id) })
                        Spacer(modifier = Modifier.width(8.dp))
                    }
                }
            }

            item {
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}
