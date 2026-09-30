// Funciones de orden superior sobre colecciones: reciben una lambda y
// operan sobre cada elemento sin necesidad de bucles explícitos.

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(name = "Chocolate Chip", softBaked = false, hasFilling = false, price = 1.69),
    Cookie(name = "Banana Walnut", softBaked = true, hasFilling = false, price = 1.49),
    Cookie(name = "Vanilla Creme", softBaked = false, hasFilling = true, price = 1.59),
    Cookie(name = "Chocolate Peanut Butter", softBaked = false, hasFilling = true, price = 1.49),
    Cookie(name = "Snickerdoodle", softBaked = true, hasFilling = false, price = 1.39),
    Cookie(name = "Blueberry Tart", softBaked = true, hasFilling = true, price = 1.79),
    Cookie(name = "Sugar and Sprinkles", softBaked = false, hasFilling = false, price = 1.39)
)

fun main() {
    // forEach(): ejecuta la lambda por cada elemento.
    // Dentro de una plantilla de cadena, para acceder a una propiedad se
    // necesita ${it.name}; "$it.name" NO funciona (imprime el toString() + ".name").
    println("Menu:")
    cookies.forEach {
        println("Menu item: ${it.name}")
    }

    // map(): transforma cada elemento; la colección resultante tiene el
    // mismo tamaño (aquí List<Cookie> -> List<String>).
    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }
    println("Full menu:")
    fullMenu.forEach {
        println(it)
    }

    // groupBy(): convierte la lista en un Map donde la clave es lo que
    // devuelve la lambda y el valor es la lista de elementos con esa clave.
    // Se usa "?:" (Elvis) porque leer un Map puede devolver null.
    val groupedMenu = cookies.groupBy { it.softBaked }
    val softBakedMenu = groupedMenu[true] ?: listOf()
    val crunchyMenu = groupedMenu[false] ?: listOf()

    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }
    println("Crunchy cookies:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }

    // fold(): reduce la colección a un solo valor, partiendo de un valor
    // inicial y acumulando con (acumulador, elemento).
    val totalPrice = cookies.fold(0.0) { total, cookie ->
        total + cookie.price
    }
    println("Total price: $${totalPrice}")

    // sortedBy(): ordena la colección según la propiedad que devuelve la lambda.
    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }
    println("Alphabetical menu:")
    alphabeticalMenu.forEach {
        println(it.name)
    }
}

// Salida esperada:
// Menu:
// Menu item: Chocolate Chip
// Menu item: Banana Walnut
// Menu item: Vanilla Creme
// Menu item: Chocolate Peanut Butter
// Menu item: Snickerdoodle
// Menu item: Blueberry Tart
// Menu item: Sugar and Sprinkles
// Full menu:
// Chocolate Chip - $1.69
// Banana Walnut - $1.49
// Vanilla Creme - $1.59
// Chocolate Peanut Butter - $1.49
// Snickerdoodle - $1.39
// Blueberry Tart - $1.79
// Sugar and Sprinkles - $1.39
// Soft cookies:
// Banana Walnut - $1.49
// Snickerdoodle - $1.39
// Blueberry Tart - $1.79
// Crunchy cookies:
// Chocolate Chip - $1.69
// Vanilla Creme - $1.59
// Chocolate Peanut Butter - $1.49
// Sugar and Sprinkles - $1.39
// Total price: $10.83
// Alphabetical menu:
// Banana Walnut
// Blueberry Tart
// Chocolate Chip
// Chocolate Peanut Butter
// Snickerdoodle
// Sugar and Sprinkles
// Vanilla Creme
