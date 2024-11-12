package com.grupoMALPAP.proyecto.scaffold

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.grupoMALPAP.proyecto.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    titulo: String,
    onBackClick : () -> Unit,
    onMenuClick : (String) -> Unit
) {
    var menuExpandido by remember { mutableStateOf(false) }

    TopAppBar(
        title = {
            Row {
                Text(titulo)
            }
        },
        navigationIcon = {
            IconButton(
                onClick = onBackClick
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Volver Atras"
                )
            }
        },
        actions = {
            IconButton(
                onClick = { menuExpandido = !menuExpandido }
            ) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menu"
                )
            }
            DropdownMenu(
                expanded = menuExpandido,
                onDismissRequest = { menuExpandido = false }
            ) {
                DropdownMenuItem(
                    text = { Text(text = stringResource(R.string.mnuDropDown_1)) },
                    onClick = {
                        onMenuClick("1")
                        menuExpandido = false
                    }
                )
                DropdownMenuItem(
                    text = { Text(text = stringResource(R.string.mnuDropDown_2)) },
                    onClick = {
                        onMenuClick("2")
                        menuExpandido = false
                    }
                )
                DropdownMenuItem(
                    text = { Text(text = stringResource(R.string.mnuDropDown_3)) },
                    onClick = {
                        onMenuClick("3")
                        menuExpandido = false
                    }
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.White,
            titleContentColor = Color.Black
        )
    )

}