// Práctica: app de seguimiento de eventos diarios.
// Combina data class, enum class, colecciones (filter, groupBy, last())
// y propiedades de extensión.

// Tarea 2: se usa un enum en vez de String para evitar inconsistencias
// como "Mañana", "mañana", "MAÑANA".
enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING,
}

// Tarea 1: data class para guardar título, descripción (opcional),
// franja del día y duración en minutos.
data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)

// Tarea 7: propiedad de extensión que clasifica un evento como "short" o
// "long" sin modificar la data class original.
val Event.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }

fun main() {
    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)

    // Tarea 1: probar la data class
    println(event1)

    // Tarea 3: guardar todos los eventos en una sola colección mutable
    val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)

    // Tarea 4: contar eventos cortos (menos de 60 minutos)
    val shortEvents = events.filter { it.durationInMinutes < 60 }
    println("You have ${shortEvents.size} short events.")

    // Tarea 5: resumen de eventos agrupados por franja del día
    val groupedEvents = events.groupBy { it.daypart }
    groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }

    // Tarea 6: último evento del día, usando last() en vez de events[events.size - 1]
    println("Last event of the day: ${events.last().title}")

    // Tarea 7: usar la propiedad de extensión durationOfEvent
    println("Duration of first event of the day: ${events[0].durationOfEvent}")
}

// Salida esperada:
// Event(title=Wake up, description=Time to get up, daypart=MORNING, durationInMinutes=0)
// You have 5 short events.
// MORNING: 2 events
// AFTERNOON: 3 events
// EVENING: 1 events
// Last event of the day: Check out latest Android Jetpack library
// Duration of first event of the day: short
