package com.dev.asgm_kot104.ui.theme.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.dev.asgm_kot104.data.BottomNavigation

val items = listOf(
    BottomNavigation("Home", Icons.Filled.Home),
    BottomNavigation("Favorite", Icons.Filled.Favorite),
    BottomNavigation("Profile", Icons.Filled.Person),
    BottomNavigation("Setting", Icons.Filled.Settings)
)

@Composable
fun BottomNavigationBar() {
    NavigationBar {
        Row ( modifier = Modifier
            .padding()
            .background(MaterialTheme.colorScheme.inverseOnSurface)) {
            items.forEachIndexed() { index, item ->
                NavigationBarItem(selected = index == 0, onClick = { /*TODO*/ }, icon = { Icon(
                    imageVector = item.icon,
                    contentDescription = item.title,
                    tint = MaterialTheme.colorScheme.onBackground
                ) }, label = { Text(text = item.title) })
            }

        }
    }
}