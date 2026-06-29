package com.fabri.ejerciciocompras

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            navegacion(navController)
        }
    }
}

@Composable
fun navegacion(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "pantalla1"
    ) {
        composable(route = "pantalla1") {
            PantProductos(navController)
        }
        composable(route = "detalle/Leche/12.50") {
            PantDetalle(navController, nombre = "Leche Entera", precio = 12.50, imagenRes = R.drawable.leche)
        }
        composable(route = "detalle/Arroz/8.75") {
            PantDetalle(navController, nombre = "Arroz Blanco 1kg", precio = 8.75, imagenRes = R.drawable.arroz)
        }
        composable(route = "detalle/Aceite/25.00") {
            PantDetalle(navController, nombre = "Aceite Vegetal", precio = 25.00, imagenRes = R.drawable.aceite)
        }
        composable(route = "detalle/Frijoles/15.00") {
            PantDetalle(navController, nombre = "Frijoles Rojos", precio = 15.00, imagenRes = R.drawable.frijoles)
        }
        composable(route = "detalle/Pan/6.50") {
            PantDetalle(navController, nombre = "Pan de Molde", precio = 6.50, imagenRes = R.drawable.pan)
        }
        composable(route = "detalle/Huevos/28.00") {
            PantDetalle(navController, nombre = "Huevos x12", precio = 28.00, imagenRes = R.drawable.huevos)
        }
        composable(route = "detalle/Azucar/18.00") {
            PantDetalle(navController, nombre = "Azucar Blanca 1kg", precio = 18.00, imagenRes = R.drawable.azucar)
        }
        composable(route = "detalle/Atun/22.50") {
            PantDetalle(navController, nombre = "Atun en Lata", precio = 22.50, imagenRes = R.drawable.atun)
        }
        composable(route = "detalle/Sal/4.00") {
            PantDetalle(navController, nombre = "Sal Refinada", precio = 4.00, imagenRes = R.drawable.sal)
        }
        composable(route = "detalle/Pasta/9.00") {
            PantDetalle(navController, nombre = "Pasta Espagueti", precio = 9.00, imagenRes = R.drawable.pasta)
        }
    }
}

@Composable
fun PantProductos(navController: NavHostController) {
    val scrollState = rememberScrollState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(all = 12.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            Text(
                text = "Supermercado",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 12.dp)
            )

            Row(modifier = Modifier.fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f)) {
                    TarjetaProducto("Leche Entera",
                        12.50, R.drawable.leche,
                        "detalle/Leche/12.50", navController)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box(modifier = Modifier.weight(1f)) {
                    TarjetaProducto("Arroz Blanco 1kg",
                        8.75, R.drawable.arroz,
                        "detalle/Arroz/8.75", navController)
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(modifier = Modifier.fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f)) {
                    TarjetaProducto("Aceite Vegetal",
                        25.00, R.drawable.aceite,
                        "detalle/Aceite/25.00", navController)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box(modifier = Modifier.weight(1f)) {
                    TarjetaProducto("Frijoles Rojos",
                        15.00, R.drawable.frijoles,
                        "detalle/Frijoles/15.00", navController)
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(modifier = Modifier.fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f)) {
                    TarjetaProducto("Pan de Molde",
                        6.50, R.drawable.pan,
                        "detalle/Pan/6.50", navController)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box(modifier = Modifier.weight(1f)) {
                    TarjetaProducto("Huevos x12",
                        28.00, R.drawable.huevos,
                        "detalle/Huevos/28.00", navController)
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(modifier = Modifier.fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f)) {
                    TarjetaProducto("Azucar Blanca 1kg",
                        18.00, R.drawable.azucar,
                        "detalle/Azucar/18.00", navController)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box(modifier = Modifier.weight(1f)) {
                    TarjetaProducto("Atun en Lata",
                        22.50, R.drawable.atun,
                        "detalle/Atun/22.50", navController)
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(modifier = Modifier.fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f)) {
                    TarjetaProducto("Sal Refinada",
                        4.00, R.drawable.sal,
                        "detalle/Sal/4.00", navController)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box(modifier = Modifier.weight(1f)) {
                    TarjetaProducto("Pasta Espagueti",
                        9.00, R.drawable.pasta,
                        "detalle/Pasta/9.00", navController)
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}

@Composable
fun TarjetaProducto(
    nombre: String,
    precio: Double,
    imagenRes: Int,
    ruta: String,
    navController: NavHostController
) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = Color(0xFFEEEEEE),
        shadowElevation = 2.dp
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = imagenRes),
                contentDescription = nombre,
                modifier = Modifier.size(90.dp),
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(text = nombre, fontSize = 13.sp)

            Text(text = "${"%.2f".format(precio)}", fontSize = 13.sp)

            Spacer(modifier = Modifier.height(6.dp))

            Button(
                onClick = { navController.navigate(route = ruta) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Comprar")
            }
        }
    }
}

@Composable
fun PantDetalle(
    navController: NavHostController,
    nombre: String,
    precio: Double,
    imagenRes: Int
) {
    var cantidad by remember { mutableStateOf("") }
    var total by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(all = 20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.TopCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = imagenRes),
                contentDescription = nombre,
                modifier = Modifier.size(150.dp),
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(text = nombre, fontSize = 20.sp, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(20.dp))

            TextField(
                value = cantidad,
                onValueChange = { cantidad = it },
                label = { Text("Cantidad") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true
            )

            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = " ${"%.2f".format(precio)}",
                onValueChange = {},
                label = { Text("Precio") },
                modifier = Modifier.fillMaxWidth(),
            )

            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = total,
                onValueChange = {},
                label = { Text("Total") },
                modifier = Modifier.fillMaxWidth(),
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    total = " ${"%.2f".format(cantidad.toDouble() * precio)}"
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text("Calcular")
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = { navController.popBackStack() },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text("Salir")
            }
        }
    }
}