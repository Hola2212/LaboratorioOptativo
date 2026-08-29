package com.example.laboratorio.optativo.ui.components

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.laboratorio.optativo.models.Resource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.laboratorio.optativo.ui.theme.GrayGeneralText
import com.example.laboratorio.optativo.ui.theme.Pink80

@Composable
fun ResourceCard (resource: Resource, modifier: Modifier = Modifier) {
    Row(modifier = modifier) {
        Column(modifier = modifier) {
            Box(
                modifier = Modifier
                    .size(20.dp)
                    .clip(CircleShape)
                    .background(Pink80)
            ) {
                Text(
                    text = resource.id.toString(),
                    color = GrayGeneralText
                )
            }
            Text(
                text = resource.name,
                color = GrayGeneralText
            )
        }
        Column(modifier = modifier) {
            Text(
                text = resource.category,
                color = GrayGeneralText
            )
            Text(
                text = resource.lender,
                color = GrayGeneralText
            )
        }
    }
}