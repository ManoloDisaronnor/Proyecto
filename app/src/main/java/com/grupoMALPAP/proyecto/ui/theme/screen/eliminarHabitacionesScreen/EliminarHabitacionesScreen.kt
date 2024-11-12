package com.grupoMALPAP.proyecto.ui.theme.screen.eliminarHabitacionesScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun EliminarHabitacionScreen(nombre: String) {
    Box {
        Text("Eliminar Habitacion $nombre")
    }
}