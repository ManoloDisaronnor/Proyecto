package com.grupoMALPAP.Proyecto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.grupoMALPAP.proyecto.navegacion.Navegacion
import com.grupoMALPAP.proyecto.ui.theme.ProyectoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoTheme {
                Navegacion()
            }
        }
    }
}