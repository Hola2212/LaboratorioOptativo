package com.example.laboratorio.optativo.models

data class Resource(
    val id: Int,
    val name: String,
    val category: String,
    val lender: String,
    val isAvailable: Boolean,
    val note: String?
)

fun filterResources( resources: List<Resource>, selectedCategory: String, availableOnly: Boolean ): List<Resource> {
    return resources.filter { resource ->
        (selectedCategory == "Todas" || selectedCategory == resource.category) && (!availableOnly || resource.isAvailable)
    }
}

fun Resource.displayNote(): String{
    return note ?: "Sin nota"
}

fun countByCategory(resources: List<Resource>): Map<String, Int>{
    return resources
        .groupBy { resource -> resource.category }
        .map { (category, resourcesInCategory) -> category to resourcesInCategory.size }
        .toMap()
}
