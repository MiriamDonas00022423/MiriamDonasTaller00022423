package com.pmtaller2.MiriamDonas_00022423.ui.layout

import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar(
    title: String,
    showBackButton: Boolean = false,
    onBackClick: () -> Unit = {}
) {
    TopAppBar(
        title = { Text(text = title) },
        navigationIcon = {
            IconButton(onClick = {
                if (showBackButton) {
                    onBackClick()
                } else {

                }
            }) {
                Icon(
                    imageVector = if (showBackButton) Icons.Filled.ArrowBackIosNew else Icons.Filled.Menu,
                    contentDescription = if (showBackButton) "Volver" else "Menú"
                )
            }
        },
        actions = {

            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "Buscar")
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    )
}


