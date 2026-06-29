package com.fabri.sueldosybonos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SueldoScreen()
        }
    }
}

@Composable
fun SueldoScreen() {

    var nombre by remember { mutableStateOf("") }
    var meses by remember { mutableStateOf("") }
    var horas by remember { mutableStateOf("") }
    var valorHora by remember { mutableStateOf("") }

    var sueldo by remember { mutableStateOf("0") }
    var bono by remember { mutableStateOf("2000") }
    var neto by remember { mutableStateOf("0") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Nombre") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = meses,
            onValueChange = { meses = it },
            label = { Text("Meses") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = horas,
            onValueChange = { horas = it },
            label = { Text("Horas") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = valorHora,
            onValueChange = { valorHora = it },
            label = { Text("Valor Hora") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Sueldo: $sueldo",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Bono: $bono",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Sueldo Neto: $neto",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {

                val h = horas.toDoubleOrNull() ?: 0.0
                val vh = valorHora.toDoubleOrNull() ?: 0.0

                val sueldoCalculado = h * vh
                val bonoCalculado = 2000.0
                val netoCalculado = sueldoCalculado + bonoCalculado

                sueldo = sueldoCalculado.toString()
                bono = bonoCalculado.toString()
                neto = netoCalculado.toString()
            }
        ) {
            Text("TOTAL")
        }
    }
}