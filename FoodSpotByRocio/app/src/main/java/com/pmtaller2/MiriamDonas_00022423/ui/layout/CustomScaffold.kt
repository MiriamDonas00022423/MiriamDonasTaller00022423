package com.pmtaller2.MiriamDonas_00022423.ui.layout

import RestaurantMenuScreenNavigationId
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.pmtaller2.MiriamDonas_00022423.ui.layout.CustomBottomBar
import com.pmtaller2.MiriamDonas_00022423.ui.layout.CustomTopBar
import com.pmtaller2.MiriamDonas_00022423.ui.navigations.MainNavigation.MainNavigation

data class BottomNavItem(val label: String, val icon: ImageVector, val route: String)
@Composable
fun CustomScaffold() {
    val navController = rememberNavController()
    var selectedItem by rememberSaveable { mutableStateOf("restaurants") }
    var title by rememberSaveable { mutableStateOf("Restaurantes") }
    val currentBackStackEntry = navController.currentBackStackEntryAsState().value
    val currentDestination = currentBackStackEntry?.destination?.route

    val showBackButton = currentDestination == "RestaurantMenuScreenNavigation/{id}"


    val navItems = listOf(
        BottomNavItem("Restaurantes", Icons.Filled.Restaurant, "restaurants"),
        BottomNavItem("Buscar", Icons.Filled.Search, "search"),
        BottomNavItem("Órdenes", Icons.Filled.List, "orders")
    )

    LaunchedEffect(currentDestination) {
        title = when (currentDestination) {
            "restaurants" -> "Restaurantes"
            "search" -> "Buscar"
            "orders" -> "Órdenes"
            "RestaurantMenuScreenNavigation/{id}" -> "Menú"
            else -> "Restaurantes"
        }
    }

    Scaffold(
        topBar = {
            CustomTopBar(
                title = title,
                showBackButton = showBackButton,
                onBackClick = { navController.popBackStack() },
            )
            Spacer(modifier = Modifier.height(56.dp))
        },
        bottomBar = {
            CustomBottomBar(
                items = navItems,
                selectedItem = selectedItem,
                onItemSelected = {
                    selectedItem = it
                    title = navItems.find { item -> item.route == it }?.label ?: "App"
                    navController.navigate(it) {
                        popUpTo(navController.graph.startDestinationId) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            MainNavigation(navController)
        }
    }
}

