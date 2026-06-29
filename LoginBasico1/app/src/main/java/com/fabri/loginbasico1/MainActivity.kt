package com.fabri.loginbasico1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            var usuario by remember { mutableStateOf("") }
            var contrasena by remember { mutableStateOf("") }

            Scaffold { paddingValues ->

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues)
                        .background(MaterialTheme.colorScheme.primary)
                        .padding(15.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Surface(
                        color = MaterialTheme.colorScheme.secondary,
                        shape = RoundedCornerShape(10.dp),
                        shadowElevation = 10.dp,
                        modifier = Modifier
                            .width(320.dp)
                            .height(750.dp)
                    ) {

                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(20.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {

                            Spacer(modifier = Modifier.height(15.dp))

                            Image(
                                painter = painterResource(id = R.drawable.user),
                                contentDescription = "Usuario",
                                modifier = Modifier
                                    .size(210.dp)
                                    .clip(CircleShape)
                            )

                            Spacer(modifier = Modifier.height(30.dp))

                            TextField(
                                value = usuario,
                                onValueChange = { usuario = it },
                                label = { Text("Usuario") },
                                modifier = Modifier.fillMaxWidth()
                            )

                            Spacer(modifier = Modifier.height(15.dp))

                            TextField(
                                value = contrasena,
                                onValueChange = { contrasena = it },
                                label = { Text("Contraseña") },
                                modifier = Modifier.fillMaxWidth()
                            )

                            Spacer(modifier = Modifier.height(35.dp))

                            Button(
                                onClick = {},
                                shape = RoundedCornerShape(20.dp)
                            ) {
                                Text("Ingresar")
                            }

                            Spacer(modifier = Modifier.weight(1f))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center
                            ) {

                                TextButton(onClick = {}) {
                                    Text("Registrar")
                                }

                                TextButton(onClick = {}) {
                                    Text("Recuperar")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}