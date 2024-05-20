package com.dev.asgm_kot104

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dev.asgm_kot104.ui.theme.Asgm_kot104Theme
import com.dev.asgm_kot104.ui.theme.CategoriesSection
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Asgm_kot104Theme {
                // A surface container using the 'background' color from the theme
                SetBarColor(color = MaterialTheme.colorScheme.primary)
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen();
                }
            }
        }
    }
}

@Composable
fun SetBarColor(color: Color) {
    var systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.setStatusBarColor(color = color)
    }
}
@Preview
@Composable
fun HomeScreen () {
    Scaffold (
        bottomBar = {
            BottomNavigationBar()
        }
    ) {
        padding -> Column (
            modifier = Modifier.padding(padding).fillMaxSize()
        ) {
            TopBarHomeSection()
            CategoriesSection()
            ProductSection()
        }

    }
}


