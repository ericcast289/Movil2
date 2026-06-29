package com.cesar.pantallas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

fun composable(route: String, function: Any) {}

@Composable
fun navegacion(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "pantalla1"
    )
    {
            composable(route = "pantalla1") {
                Pant1(navController)
            }

            composable(route = "pantalla2") {
                Pant2(navController)
            }

            composable(route = "pantalla3") {
                Pant3(navController)
            }
        }

    }


    @Composable
    fun Pant1(navController: NavHostController) {

        Box(
            modifier = Modifier.fillMaxSize().padding(all = 10.dp)
                .background(color = MaterialTheme.colorScheme.primary)
        ) {
            Column(modifier = Modifier.align(Alignment.Center)) {
                Text("Bienvenido a pantalla 1")
                Button(onClick = { navController.navigate(route = "pantalla2") }) {
                    Text("Ingresar a Pantalla 2")
                }
                Button(onClick = { navController.navigate(route = "pantalla3") }) {
                    Text("Ingresar a pantalla 3")
                }
            }
        }
    }


    @Composable
    fun Pant2(navController: NavHostController) {
        Box(modifier = Modifier.
        fillMaxSize().
        padding(all = 10.dp)//margen interno de 10 pixeles
                .background(color = MaterialTheme.colorScheme.primary)) {
            Column(modifier = Modifier.align(Alignment.Center)) {
                Text("Bienvenido a pantalla 2")
                Button(onClick = { navController.navigate(route = "pantalla2") }) {
                    Text("Ingresar a Pantalla 1")
                }
                Button(onClick = { navController.navigate(route = "pantalla3") }) {
                    Text("Ingresar a pantalla 3")
                }
            }
        }
    }

    @Composable
    fun Pant3(navController: NavHostController) {
        Box(
            modifier = Modifier.fillMaxSize().padding(all = 10.dp)
                .background(color = MaterialTheme.colorScheme.primary)
        ) {
            Column(modifier = Modifier.align(Alignment.Center)) {
                Text("Bienvenido a pantalla 3")
                Button(onClick = { navController.navigate(route = "pantalla2") }) {
                    Text("Ingresar a Pantalla 2")
                }
                Button(onClick = { navController.navigate(route = "pantalla3") }) {
                    Text("Ingresar a pantalla 1")
                }
            }
        }
    }


