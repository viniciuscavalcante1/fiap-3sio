package loops

fun main() {
    var numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var i = 0
    while (i < numbers.size) {
        if (numbers[i] % 2 == 0) {
            println("Even number: ${numbers[i]}")
        } else {
            println("Odd number: ${numbers[i]}")
        }
        i++
    }
}