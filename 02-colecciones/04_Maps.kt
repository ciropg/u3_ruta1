// Map: pares clave-valor creados con "to". Las claves son únicas, los
// valores pueden repetirse. Si la clave no existe, get() devuelve null.

fun main() {
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    println(solarSystem.size)
    solarSystem["Pluto"] = 5
    println(solarSystem.size)
    println(solarSystem["Pluto"])
    println(solarSystem.get("Theia"))

    solarSystem.remove("Pluto")
    println(solarSystem.size)

    solarSystem["Jupiter"] = 78
    println(solarSystem["Jupiter"])
}

// Salida esperada:
// 8
// 9
// 5
// null
// 8
// 78
