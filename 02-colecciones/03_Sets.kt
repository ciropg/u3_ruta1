package sets

// Set: colección SIN orden y SIN duplicados. Usa códigos hash, por eso
// buscar un elemento (contains) es muy rápido. No tiene índices.

fun main() {
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    println(solarSystem.size)
    solarSystem.add("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))

    solarSystem.add("Pluto")   // duplicado: no se agrega
    println(solarSystem.size)

    solarSystem.remove("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))
}

// Salida esperada:
// 8
// 9
// true
// 9
// 8
// false
