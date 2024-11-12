package com.grupoMALPAP.proyecto.ui.theme.screen.seleccionDeHabitacionesScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.grupoMALPAP.proyecto.R
import com.grupoMALPAP.proyecto.scaffold.TopBar

@Composable
fun SeleccionDeHabitacionScreen(
    nombre: String,
    navigateToBack: () -> Unit,
    navigateToAgregarElemento: () -> Unit,
    navigateToEliminarElemento: () -> Unit,
    navigateToLogin: () -> Unit
) {
    // TODO Columna provisional, implementar distribucion de la pantalla
    Scaffold(
        topBar = { TopBar(
            titulo = stringResource(R.string.topBar_Casas),
            onBackClick = navigateToBack,
            onMenuClick = { option ->
                when (option) {
                    "1" -> navigateToAgregarElemento()
                    "2" -> navigateToEliminarElemento()
                    "3" -> navigateToLogin()
                }
            }
        ) }
    ) { valorPadding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(valorPadding).background(Color(0xFF4F865C)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Texto que coge el mensaje de bienvenida de res/values/strings.xml
            Text(stringResource(id = R.string.Bienvenida) + " " + nombre, style = MaterialTheme.typography.displayMedium)
        }

    }
}