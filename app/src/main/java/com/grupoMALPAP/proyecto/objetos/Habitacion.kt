package com.grupoMALPAP.proyecto.objetos

import androidx.compose.ui.graphics.Color
import com.grupoMALPAP.proyecto.osbjetos.ElementoHabitacion

data class Habitacion(
    val nombre: String,
    val color: Color,
    val elementos: List<ElementoHabitacion>
)