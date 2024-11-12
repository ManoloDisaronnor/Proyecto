package com.grupoMALPAP.proyecto.scaffold

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable

// FICHERO PARA DISEÑAR Y DAR FUNCIONALIDAD AL FLOATING ACTION BUTTON
@Composable
fun MyFloatingActionButton(navigateToCasas: (String) -> Unit, nombre: String){
    FloatingActionButton(
        onClick = {navigateToCasas(nombre)}
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Añadir"
        )
    }
}