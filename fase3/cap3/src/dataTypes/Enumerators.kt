package dataTypes

// Enumerators

// Enumerators are used to define a set of constants with a specific type.
// The constants are separated by commas and are defined inside a block of code.

fun main() {
    val color = Colors.RED
    when (color) {
        Colors.RED -> println("The color is red")
        Colors.GREEN -> println("The color is green")
        Colors.BLUE -> println("The color is blue")
    }

    val direction = Directions.NORTH
    println("The direction is ${direction.value}")
}

enum class Colors {
    RED, GREEN, BLUE
}

enum class Directions(val value: String) {
    NORTH("North"),
    SOUTH("South"),
    EAST("East"),
    WEST("West")
}

