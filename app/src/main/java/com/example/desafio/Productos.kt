package com.example.desafio

data class Producto(
    val id: Int,
    var nombre: String,
    var descripcion: String,
    var disponible: Boolean,
    var habilitado: Boolean,
    var stock: Int = 0
)

fun main() {
    val productos = listOf(
        Producto(999, "Lapiz", "Tinta Negra", false, true, 500),
        Producto(998, "Hojas", "Formato carta", true, false, 1000),
        Producto(997, "Borrador", "N/A", true, false, 250),
        Producto(996, "Regla", "Metálica", false, true, 0),
    )

    val productosProcesados = productos.map {
        Producto(
            it.id,
            it.nombre.uppercase(),
            it.descripcion,
            it.disponible,
            it.habilitado,
            if (it.stock == 0) 0 else it.stock
        )
    }

    productosProcesados.sortedByDescending { it.stock }.forEach {
        println("+++++++++++++++++++++++++++++++++++++++++++++")
        println("ID: ${it.id}")
        println("NOMBRE: ${it.nombre}")
        println("DESCRIPCIÓN: ${it.descripcion}")
        println("DISPONIBLE: ${if (it.disponible) "SI" else "NO"}")
        println("HABILITADO: ${if (it.habilitado) "SI" else "NO"}")
        println("STOCK: ${it.stock}")
        println("+++++++++++++++++++++++++++++++++++++++++++++")
    }
}