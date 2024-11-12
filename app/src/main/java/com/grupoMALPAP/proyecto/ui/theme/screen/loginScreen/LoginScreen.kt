package com.grupoMALPAP.proyecto.ui.theme.screen.loginScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.grupoMALPAP.proyecto.R
import com.grupoMALPAP.proyecto.scaffold.MyFloatingActionButton

@Composable
fun LoginScreen(navigateToCasas: (String) -> Unit) {
    // Variable para usar en el TextField
    var nombre by remember { mutableStateOf("") }
    // TODO Borrar el Scaffold y MyFloatingActionButton y organizar el layout de la pantalla
    // Scaffold y floatingActionButton para implementar futuramente en otra pantalla
    Scaffold(
        floatingActionButton = { MyFloatingActionButton(navigateToCasas, nombre) }
    ) { paddingValue ->
        Column(
            modifier = Modifier.fillMaxSize().padding(paddingValue),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Text y TextField para introducir el nombre del usuario que se usara en las diferentes pantallas
            Text(stringResource(id = R.string.Login), style = MaterialTheme.typography.displayMedium)
            TextField(
                value = nombre,
                onValueChange = { nombre = it }
            )
            // Botón para ir a la pantalla de Detalle, recibe el nombre como parámetro
            Button( onClick = { navigateToCasas(nombre) } ) {
                Text(stringResource(id = R.string.botonIrAMisCasas))
            }
        }
    }
}