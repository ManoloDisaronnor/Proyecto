package com.grupoMALPAP.proyecto.navegacion

import kotlinx.serialization.Serializable

// Fichero usado para definir los objetos que se utilizaran para la navegacion
// Cuando se cree una nueva pantalla, esta tendra que tener un objeto en este fichero que la represente
// TODO agregar todas las pantallas que faltan

@Serializable
object Login

@Serializable
data class SeleccionDeHabitaciones(val nombre: String)

@Serializable
data class CrearHabitacion(val nombre: String)

@Serializable
data class EliminarHabitacion(val nombre: String)