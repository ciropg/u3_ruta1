package arrays

// Array: secuencia de valores del mismo tipo, tamaño FIJO, con acceso
// aleatorio rápido mediante índice (empezando en 0).

fun main() {
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanets + gasPlanets

    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])

    solarSystem[3] = "Little Earth"
    println(solarSystem[3])

    // solarSystem[8] = "Pluto"
    // Nota: esta línea produce ArrayIndexOutOfBoundsException porque el array
    // tiene tamaño fijo de 8 elementos (índices válidos 0..7) y no se puede redimensionar.
    // Exception: java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8

    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
    println(newSolarSystem[8])
}

// Salida esperada:
// Mercury
// Venus
// Earth
// Mars
// Jupiter
// Saturn
// Uranus
// Neptune
// Little Earth
// Pluto
