package com.fabri.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            var nombre by remember { mutableStateOf("") }
            var clase by remember { mutableStateOf("") }
            var nota1 by remember { mutableStateOf("") }
            var nota2 by remember { mutableStateOf("") }
            var mensaje by remember { mutableStateOf("") }

            Column(
                modifier = Modifier.fillMaxSize().padding(15.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                OutlinedTextField(
                    value = nombre,
                    onValueChange = { nombre = it },
                    label = { Text("Nombre") },
                    modifier = Modifier.width(260.dp)
                )

                Spacer(modifier = Modifier.height(10.dp))

                OutlinedTextField(
                    value = clase,
                    onValueChange = { clase = it },
                    label = { Text("Clase") },
                    modifier = Modifier.width(255.dp)
                )

                Spacer(modifier = Modifier.height(12.dp))

                OutlinedTextField(
                    value = nota1,
                    onValueChange = { nota1 = it },
                    label = { Text("Nota 1") },
                    modifier = Modifier.width(250.dp)
                )

                Spacer(modifier = Modifier.height(17.dp))

                OutlinedTextField(
                    value = nota2,
                    onValueChange = { nota2 = it },
                    label = { Text("Nota 2") },
                    modifier = Modifier.width(248.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = mensaje,
                    fontSize = 17.sp,
                    modifier = Modifier.padding(8.dp)
                )

                Spacer(modifier = Modifier.height(17.dp))

                Button(
                    onClick = {

                        val n1 = nota1.toDouble()
                        val n2 = nota2.toDouble()

                        val promedio = (n1 + n2) / 2

                        mensaje =
                            "Nombre: $nombre \n" +
                                    "Clase: $clase \n" +
                                    "Promedio: $promedio"
                    },
                    modifier = Modifier.width(170.dp)
                ) {

                    Text(
                        text = "Calcular",
                        fontSize = 18.sp
                    )
                }
            }
        }
    }
}
