import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.pmtaller2.MiriamDonas_00022423.data.model.Dish
import com.pmtaller2.MiriamDonas_00022423.data.model.Restaurant

@Composable
fun RestaurantItem(
    restaurant: Restaurant,
    onRestaurantClick: (Int) -> Unit
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = Modifier
            .width(160.dp)
            .clickable { onRestaurantClick(restaurant.id) }
    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            AsyncImage(
                model = restaurant.imageUrl,
                contentDescription = restaurant.name,
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = restaurant.name,
                style = MaterialTheme.typography.bodyMedium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}


val restaurantTest =
    Restaurant(
        id = 1,
        name = "Pizza Planet",
        description = "Las mejores pizzas del universo",
        imageUrl = "https://peruretail.sfo3.cdn.digitaloceanspaces.com/wp-content/uploads/pizza-3.jpg",
        categories = listOf("Pizzas", "Comida Italiana", "Vegetariano"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Pizza Pepperoni",
                description = "Clásica pizza con pepperoni y queso.",
                imageUrl = "https://example.com/pepperoni.jpg"
            ),
            Dish(
                id = 2,
                name = "Pizza Vegetariana",
                description = "Pizza saludable con verduras frescas.",
                imageUrl = "https://example.com/veggie.jpg"
            )
        )
    )

@Preview(showBackground = true)
@Composable
fun RestaurantItemPreview(){
    RestaurantItem(restaurantTest, onRestaurantClick = {})
}