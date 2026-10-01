package genericos01
// Genéricos: en vez de crear una clase distinta por cada tipo de respuesta
// (String, Boolean, Int...), usamos un parámetro de tipo <T> que se define
// al momento de crear la instancia.

class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)

fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", "medium")
    val question2 = Question<Boolean>("The sky is green. True or false", false, "easy")
    val question3 = Question<Int>("How many days are there between full moons?", 28, "hard")
}

// Salida esperada: (no hay println, el programa compila y no imprime nada)
