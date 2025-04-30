package com.pmtaller2.MiriamDonas_00022423.ui.navigations.MainNavigation

import OrdersScreenNavigation
import RestaurantMenuScreen
import RestaurantMenuScreenNavigation
import RestaurantScreenNavigation
import SearchScreenNavigation
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pmtaller2.MiriamDonas_00022423.ui.screens.Orders.OrdersScreen
import com.pmtaller2.MiriamDonas_00022423.ui.screens.Search.SearchScreen
import com.pmtaller2.MiriamDonas_00022423.ui.screens.Restaurant.RestaurantScreen


@Composable
fun MainNavigation(navController: NavHostController) {

    val onRestaurantClick = { restaurantId: Int ->
        navController.navigate(RestaurantMenuScreenNavigation(restaurantId))
    }

    NavHost(
        navController = navController,
        startDestination = RestaurantScreenNavigation
    ) {
        composable<RestaurantScreenNavigation> {
            RestaurantScreen(onRestaurantClick = onRestaurantClick)
        }

        composable<RestaurantMenuScreenNavigation> { backStackEntry ->
            val restaurantId = backStackEntry.arguments?.getInt("id") ?: 0
            RestaurantMenuScreen(restaurantId = restaurantId)
        }

        composable("orders") {
            OrdersScreen()
        }

        composable("search") {
            SearchScreen()
        }
    }
}



