package com.dev.asgm_kot104

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dev.asgm_kot104.ui.theme.Typography

@Preview
@Composable
fun TopBarHomeSection() {
    Row (modifier = Modifier
        .padding(16.dp)
        .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {

        Box (
            modifier = Modifier
                .clip(RoundedCornerShape(15.dp))
                .background(MaterialTheme.colorScheme.secondaryContainer)
                .clickable { }
                .padding(6.dp)
        ) {
            Icon(imageVector = Icons.Rounded.Search, contentDescription = "Search", tint = MaterialTheme.colorScheme.onSecondaryContainer)
        }

        Column (horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Text(text = "Make Home,", style = Typography.bodySmall)
            Spacer(Modifier.height(8.dp))
            Text(text = "Beautiful", style = Typography.labelLarge)
        }

        Box (
            modifier = Modifier
                .clip(RoundedCornerShape(15.dp))
                .background(MaterialTheme.colorScheme.secondaryContainer)
                .clickable { }
                .padding(6.dp)
        ) {
            Icon(imageVector = Icons.Rounded.ShoppingCart, contentDescription = "Search", tint = MaterialTheme.colorScheme.onSecondaryContainer)
        }

    }



}


