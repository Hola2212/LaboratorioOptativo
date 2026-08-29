package com.example.laboratorio.optativo.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.laboratorio.optativo.data.ResourcesRepository
import com.example.laboratorio.optativo.models.Resource
import com.example.laboratorio.optativo.models.filterResources
import com.example.laboratorio.optativo.ui.components.ElementPublish

@Composable
fun ScreenFeed (
    modifier: Modifier = Modifier
) {
    val resources = ResourcesRepository.getList()


    var searchQuery by rememberSaveable { mutableStateOf("Todas")}
    var showAvailableOnly by rememberSaveable { mutableStateOf(false) }

    val filteredResources = filterResources(resources.toList(), searchQuery, showAvailableOnly)

    FeedContent(
        filteredResources = filteredResources,
        searchQuery = searchQuery,
        onSearchQueryChange = { searchQuery = it },
        showAvailableOnly = showAvailableOnly,
        onShowAvailableOnlyChange = { showAvailableOnly = it },
        modifier = modifier
    )
}

@Composable
fun FeedContent(
    filteredResources: List<Resource>,
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    showAvailableOnly: Boolean,
    onShowAvailableOnlyChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        OutlinedTextField(
            value = searchQuery,
            onValueChange = onSearchQueryChange,
            label = { Text("Buscar por artículo") }
        )
        Row {
            Switch(
                checked = showAvailableOnly,
                onCheckedChange = onShowAvailableOnlyChange
            )
            Text("Solo recursos disponibles")
        }

        if (filteredResources.isEmpty()) {
            Text("No se encontraron recursos")
            Text("Cambia la búsqueda o el filtro.")
        } else {
            filteredResources.forEach { resource ->
                ElementPublish(resource, modifier)
            }
        }
    }
}