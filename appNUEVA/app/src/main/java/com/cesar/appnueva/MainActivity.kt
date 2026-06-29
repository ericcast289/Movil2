package com.fabri.appnueva

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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

            Scaffold() { paddingValues ->

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues)
                        .background(color = MaterialTheme.colorScheme.primary)
                        .padding(all = 10.dp)
                ) {


                    Surface(
                        color = MaterialTheme.colorScheme.secondary,
                        shape = RoundedCornerShape(size = 10.dp),
                        shadowElevation = 10.dp,
                        modifier = Modifier
                            .width(180.dp)
                            .height(200.dp)
                            .align(Alignment.TopStart)

                    ) {

                        Box {

                            Image(
                                painter = painterResource(R.drawable.user),
                                contentDescription = "Imagen de Prueba",
                                modifier = Modifier
                                    .size(150.dp)
                                    .align(Alignment.TopCenter)
                                    .clip(CircleShape)
                            )

                            Column(
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .padding(bottom = 10.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {

                                Text("Usuario: Juan Perez")

                                Text("Rol: Programador")
                            }
                        }
                    }


                    Surface(
                        color = MaterialTheme.colorScheme.secondary,
                        shape = RoundedCornerShape(size = 10.dp),
                        shadowElevation = 10.dp,
                        modifier = Modifier
                            .width(180.dp)
                            .height(200.dp)
                            .align(Alignment.TopEnd)

                    ) {

                        Box {

                            Image(
                                painter = painterResource(R.drawable.usuario2),
                                contentDescription = "Imagen de Prueba",
                                modifier = Modifier
                                    .size(150.dp)
                                    .align(Alignment.TopCenter)
                                    .clip(CircleShape)
                            )

                            Column(
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .padding(bottom = 10.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {

                                Text("Usuario: Cesar Ortiz")

                                Text("Rol: Analista de Sistemas")
                            }
                        }
                    }


                    Surface(
                        color = MaterialTheme.colorScheme.secondary,
                        shape = RoundedCornerShape(size = 10.dp),
                        shadowElevation = 10.dp,
                        modifier = Modifier
                            .width(180.dp)
                            .height(200.dp)
                            .align(Alignment.CenterStart)

                    ) {

                        Box {

                            Image(
                                painter = painterResource(R.drawable.usuario3),
                                contentDescription = "Imagen de Prueba",
                                modifier = Modifier
                                    .size(150.dp)
                                    .align(Alignment.TopCenter)
                                    .clip(CircleShape)
                            )

                            Column(
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .padding(bottom = 10.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {

                                Text("Usuario Mario Ruiz")

                                Text("Rol: Diseñador")
                            }
                        }
                    }


                    Surface(
                        color = MaterialTheme.colorScheme.secondary,
                        shape = RoundedCornerShape(size = 10.dp),
                        shadowElevation = 10.dp,
                        modifier = Modifier
                            .width(180.dp)
                            .height(200.dp)
                            .align(Alignment.CenterEnd)

                    ) {

                        Box {

                            Image(
                                painter = painterResource(R.drawable.usuario4),
                                contentDescription = "Imagen de Prueba",
                                modifier = Modifier
                                    .size(150.dp)
                                    .align(Alignment.TopCenter)
                                    .clip(CircleShape)
                            )

                            Column(
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .padding(bottom = 10.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {

                                Text("Usuario: Lenin Martinez")

                                Text("Rol: Manager")
                            }
                        }
                    }


                    Surface(
                        color = MaterialTheme.colorScheme.secondary,
                        shape = RoundedCornerShape(size = 10.dp),
                        shadowElevation = 10.dp,
                        modifier = Modifier
                            .width(180.dp)
                            .height(200.dp)
                            .align(Alignment.BottomStart)

                    ) {

                        Box {

                            Image(
                                painter = painterResource(R.drawable.usuario5),
                                contentDescription = "Imagen de Prueba",
                                modifier = Modifier
                                    .size(150.dp)
                                    .align(Alignment.TopCenter)
                                    .clip(CircleShape)
                            )

                            Column(
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .padding(bottom = 10.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {

                                Text("Usuario: Maria Ponce")

                                Text("Rol: Secretaria")
                            }
                        }
                    }


                    Surface(
                        color = MaterialTheme.colorScheme.secondary,
                        shape = RoundedCornerShape(size = 10.dp),
                        shadowElevation = 10.dp,
                        modifier = Modifier
                            .width(180.dp)
                            .height(200.dp)
                            .align(Alignment.BottomEnd)

                    ) {

                        Box {

                            Image(
                                painter = painterResource(R.drawable.usuario6),
                                contentDescription = "Imagen de Prueba",
                                modifier = Modifier
                                    .size(150.dp)
                                    .align(Alignment.TopCenter)
                                    .clip(CircleShape)
                            )

                            Column(
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .padding(bottom = 10.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {

                                Text("Usuario: Valeria Ortiz")

                                Text("Rol: Administradora")
                            }
                        }
                    }
                }
            }
        }
    }
}