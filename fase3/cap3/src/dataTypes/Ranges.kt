package dataTypes

fun main() {
    // Closed range (..) - includes the last value
    // Half Closed range (until) - excludes the last value

    // Closed range:
    val numbers = 1..10
    for (i in numbers) {
        print("$i ")
    }

    println()

    // Half Closed range:
    val numbers2 = 1 until 10
    for (i in numbers2) {
        print("$i ")
    }
}