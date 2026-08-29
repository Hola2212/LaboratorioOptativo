package com.example.laboratorio.optativo.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.laboratorio.optativo.models.Resource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import com.example.laboratorio.optativo.models.displayNote
import com.example.laboratorio.optativo.ui.theme.GrayGeneralText


@Composable
fun ResourceCard (resource: Resource, modifier: Modifier = Modifier) {
    Text(
        text = "Recurso",
        color = GrayGeneralText
    )
    Column(modifier = modifier) {
        Text(
            text = resource.name,
            color = GrayGeneralText
        )
        Text(
            text = "Categoría: ${resource.category}",
            color = GrayGeneralText
        )
        Text(
            text = "Prestador: ${resource.lender}",
            color = GrayGeneralText
        )
        Text(
            text = "Nota: ${resource.displayNote()}",
            color = GrayGeneralText
        )
        Row(modifier = modifier) {
            if (resource.isAvailable){
                Text(
                    text = "Disponible",
                    color = GrayGeneralText
                )
                Text(       //Se que va con botón, pero no supe como implementarlo
                    text = "Solicitar",
                    color = GrayGeneralText
                )
            }
            else{
                Text(
                    text = "No disponible",
                    color = GrayGeneralText
                )
            }
        }
    }

}