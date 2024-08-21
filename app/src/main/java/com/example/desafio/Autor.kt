package com.example.desafio

import java.time.LocalDate

//defino la clase Autor
data class Autor(
    val nombre: String,
    val apellido: String,
    val obrasDestacadas: List<String>,
    val anoNacimiento: Int,
    val anoFallecimiento: Int?,
    val comentario: String,
)

fun Autor.calcularEdad(): String {
    if (anoFallecimiento != null) {
        return "Falleció en $anoFallecimiento"
    } else {
        val anoActual = LocalDate.now().year
        val edad = anoActual - this.anoNacimiento
        return "Tiene $edad años"
    }
}

fun main() {
    val autor = Autor(
        "Caroline",
        "Alexander",
        listOf("La Ilíada: una nueva traducción", "Oro perdido de la Edad Media: guerra, tesoro y el misterio de los sajones", "La guerra que mató a Aquiles: la verdadera historia de la Ilíada y la guerra de Troya", "The Bounty: La verdadera historia del motín en el Bounty", "El Endurance: la legendaria expedición antártica de Shackleton", "La última expedición de la señora Chippy, 1914-1915", "Battle's End: Un equipo de fútbol seminole revisitado", "El Camino a Xanadú", "Una estación seca: tras las huellas de Mary Kingsley en África Ecuatorial" ),
        1956,
        null,
        "Caroline Alexander es una escritora, clasicista y cineasta británica. Es autora de los best-sellers The Endurance y The Bounty, y otras obras de no ficción literaria, como The Way to Xanadu y The War that Killed Achilles. En 2015, publicó una nueva traducción de la Ilíada de Homero."
    )

    val edad = autor.calcularEdad()
    println("Edad: $edad")

    println(
        "Nombre: ${autor.nombre}, apellidos: ${autor.apellido}, obras destacadas: ${autor.obrasDestacadas}, año de nacimiento: ${autor.anoNacimiento}, año de fallecimiento: ${autor.anoFallecimiento}, comentario: ${autor.comentario}"
    )
}

