package com.pmtaller2.MiriamDonas_00022423.ui.layout

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector


@Composable
fun CustomBottomBar(
    items: List<BottomNavItem>,
    selectedItem: String,
    onItemSelected: (String) -> Unit
) {
    NavigationBar {
        items.forEach { item ->
            NavigationBarItem(
                selected = selectedItem == item.route,
                onClick = { onItemSelected(item.route) },
                icon = { Icon(item.icon, contentDescription = item.label) },
                label = { Text(item.label) }
            )
        }
    }
}
