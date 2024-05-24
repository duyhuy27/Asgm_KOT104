package com.example.asm_thanghtph31577

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dev.asgm_kot104.ui.theme.Asgm_kot104Theme
import com.example.asm_thanghtph31577.ui.screen.BottomNavigation
import com.example.asm_thanghtph31577.ui.screen.LoginScreen
import com.example.asm_thanghtph31577.ui.screen.ProductDetail
import com.example.asm_thanghtph31577.ui.screen.SignUp
import com.example.asm_thanghtph31577.ui.screen.SplashScreen
import com.dev.asgm_kot104.R
import com.hq.quanhqph33420_assignment.screens.CartScreen
import com.hq.quanhqph33420_assignment.screens.CheckOutScreen
import com.hq.quanhqph33420_assignment.screens.ItemProduct
import com.hq.quanhqph33420_assignment.screens.NotificationScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Asgm_kot104Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navControl = rememberNavController()

                    NavHost(
                        navController = navControl,
                        startDestination = "splash"
                    ) {
                        composable("splash") {
                            SplashScreen(navControl)
                        }
                        composable("login") {
                            LoginScreen(navControl)
                        }
                        composable("sign") {
                            SignUp(navControl)
                        }

                        composable("home") {
                            BottomNavigation(navControl)
                        }
                        composable(Screens.ProductDetail.screen) {
                            ItemProduct(navControl)
                        }

                        composable(Screens.Card.screen) {
                            CartScreen(navControl)
                        }

                        composable("checkout") {
                            CheckOutScreen(navControl)
                        }
                        composable("notification") {
                            NotificationScreen(navControl)
                        }

                    }
                }
            }
        }
    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        Asgm_kot104Theme {
            Greeting("Android")
        }
    }
}