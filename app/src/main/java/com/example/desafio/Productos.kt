package com.example.desafio

data class Producto(
    val id: Int,
    var nombre: String,
    var descripcion: String,
    var disponible: String,
    var habilitado: String,
    var stock: Int = 0
)

fun main() {
    val productos = listOf(
        Producto(999, "Lapiz", "N/A", "SI", "SI", 500),
        Producto(998, "Hoja de carta", "Hojas", "SI", "SI", 1000),
        Producto(997, "Borrador", "N/A", "SI", "SI", 250),
        Producto(996, "Regla", "Metálica", "SI", "SI", 0),
    )

    val productosProcesados = productos.map {
        Producto(
            it.id,
            it.nombre.uppercase(),
            it.descripcion,
            if (it.disponible == "true") "SI" else "NO",
            if (it.habilitado == "true") "SI" else "NO",
            if (it.stock == 0) 0 else it.stock
        )
    }

    productosProcesados.sortedByDescending { it.stock.toInt() }.forEach {
        println("+++++++++++++++++++++++++++++++++++++++++++++")
        println("ID: ${it.id}")
        println("NOMBRE: ${it.nombre}")
        println("DESCRIPCIÓN: ${it.descripcion}")
        println("DISPONIBLE: ${it.disponible}")
        println("HABILITADO: ${it.habilitado}")
        println("STOCK: ${it.stock}")
        println("+++++++++++++++++++++++++++++++++++++++++++++")
    }
}