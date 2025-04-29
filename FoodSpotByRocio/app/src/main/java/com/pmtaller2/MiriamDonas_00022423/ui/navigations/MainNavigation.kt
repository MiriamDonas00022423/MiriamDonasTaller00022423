import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable

fun MainNavigation(navController: NavHostController) {

    /*onMovieClick is a lambda function that receives the ID of the tapped movie.
    When a movie is tapped, it uses the navController to navigate to the details screen (MovieDetailScreenNavigation(movieId).*/
    val onRestaurantClick = { restaurantId: Int ->
        navController.navigate(RestaurantMenuScreenNavigation(restaurantId))
    }

    NavHost(navController = navController, startDestination = RestaurantScreenNavigation) {

        composable <RestaurantScreenNavigation> {
            RestaurantListScreen(onRestaurantClick)
        }
        composable <MovieDetailScreenNavigation> { backStackEntry ->
            val movieId = backStackEntry.arguments?.getInt("id") ?: 0
            MovieDetailScreen(movieId = movieId)
        }
        /*Displays your favorite movie screen.*/
        composable<OrdersScreenNavigation> {
            OrdersScreen()
        }
        composable<SearchScreenNavigation> {
            SearchScreen()
        }
    }
}