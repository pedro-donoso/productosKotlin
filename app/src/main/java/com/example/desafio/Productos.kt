package com.example.desafio

data class Producto(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val disponible: String,
    val habilitado: String,
    val stock: String
)

fun main() {
    val productos = listOf(
        Producto(100, "Lapiz", "N/A", "SI", "SI", "20"),
        Producto(102, "Hoja de carta", "Hojas para impresora", "SI", "SI", "100")
    )

    val productosProcesados = productos.map {
        Producto(
            it.id,
            it.nombre.uppercase(),
            it.descripcion,
            if (it.disponible == "true") "SI" else "NO",
            if (it.habilitado == "true") "SI" else "NO",
            if (it.stock == "0") "Sin Stock" else it.stock
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