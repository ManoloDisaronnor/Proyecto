package com.grupoMALPAP.proyecto.ui.theme.screen.CrearHabitacionScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun CrearHabitacionScreen(nombre: String) {
    Box {
        Text("Crear Habitacion $nombre")
    }
}