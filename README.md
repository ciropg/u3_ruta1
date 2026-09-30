# Unidad 3 - Ruta de aprendizaje 1: Más aspectos básicos de Kotlin

Curso: **Android Basics with Compose**

Todos los ejercicios de esta ruta se realizaron en **[Kotlin Playground](https://play.kotlinlang.org)**,
no en Android Studio, ya que los codelabs no involucran una app de Android sino
conceptos del lenguaje Kotlin (genéricos, colecciones, funciones de orden superior, etc.).

## Cómo ejecutar los archivos

Cada archivo `.kt` de este repositorio es **autónomo**: contiene su propio `main()`
y todas las clases necesarias. Para probar cualquiera de ellos:

1. Abre https://play.kotlinlang.org
2. Copia y pega el contenido completo del archivo `.kt` que quieras ejecutar
3. Presiona **Run**
4. Compara la salida obtenida con el comentario final del archivo (`// Salida esperada:`)

## Contenido

### 01-genericos-objetos-extensiones

Codelab: *Parámetros genéricos, objetos y extensiones*

- `01_Genericos.kt` — Parámetros de tipo genérico (`Question<T>`) para evitar
  clases repetidas por cada tipo de respuesta.
- `02_EnumClass.kt` — `enum class Difficulty` para restringir los valores válidos.
- `03_DataClass.kt` — `data class` y el `toString()` generado automáticamente.
- `04_SingletonCompanion.kt` — `object` (singleton) y `companion object` dentro de `Quiz`.
- `05_Extensiones.kt` — Propiedad de extensión (`progressText`) y función de
  extensión (`printProgressBar()`).
- `06_Interfaces.kt` — `interface ProgressPrintable` implementada por `Quiz`,
  reemplazando las funciones de extensión del paso anterior.
- `07_ScopeFunctions.kt` — Funciones de alcance `let()` y `apply()` en `printQuiz()`.

### 02-colecciones

Codelab: *Usa colecciones en Kotlin*

- `01_Arrays.kt` — `arrayOf`, concatenación de arrays, acceso por índice y
  `ArrayIndexOutOfBoundsException`.
- `02_Listas.kt` — `List` vs `MutableList`: `add`, `remove`, `removeAt`, `indexOf`, `for-in`.
- `03_Sets.kt` — `MutableSet`: ausencia de duplicados, `contains`, `remove`.
- `04_Maps.kt` — `MutableMap`: pares clave-valor con `to`, acceso con `[]` y `get()`, valores `null`.

### 03-funciones-orden-superior

Codelab: *Usa funciones de orden superior con colecciones*

- `Cookies.kt` — `forEach`, plantillas de cadena con `${}`, `map`, `filter`,
  `groupBy`, `fold` y `sortedBy` aplicados sobre una lista de `Cookie`.

### 04-practica-clases-colecciones

Codelab: *Práctica - Clases y colecciones*

- `Eventos.kt` — App de seguimiento de eventos, con las 7 tareas del codelab:
  1. `data class Event`
  2. Refactor de la franja del día a `enum class Daypart`
  3. Colección `mutableListOf<Event>` con todos los eventos
  4. `filter` para contar eventos cortos (menos de 60 minutos)
  5. `groupBy` para resumir eventos por franja del día
  6. `last()` para obtener el último evento del día
  7. Propiedad de extensión `durationOfEvent`
