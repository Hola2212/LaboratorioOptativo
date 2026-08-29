package com.example.laboratorio.optativo.data

import com.example.laboratorio.optativo.models.Resource


object ResourcesRepository {
    fun getList () = setOf<Resource>(
        Resource(
            id = 1,
            name = "Extensión",
            category = "Tecnología",
            lender = "Pablo",
            isAvailable = true,
            note = null
        ),
        Resource(
            id = 2,
            name = "Botas",
            category = "Laboratorio",
            lender = "Carlos",
            isAvailable = true,
            note = "Punta de metal talla 12 de Hombre"
        ),
        Resource(
            id = 3,
            name = "Sombrilla",
            category = "Clima",
            lender = "Sara",
            isAvailable = false,
            note = "Sombrilla portátil. Devolver al siguiente día. "
        ),
        Resource(
            id = 4,
            name = "Calculadora",
            category = "Tecnología",
            lender = "Claudia",
            isAvailable = false,
            note = null
        ),
        Resource(
            id = 5,
            name = "Bata",
            category = "Laboratorio",
            lender = "Karla",
            isAvailable = true,
            note = "Préstamos entre 10:20 y 15:50"
        )
    )
}