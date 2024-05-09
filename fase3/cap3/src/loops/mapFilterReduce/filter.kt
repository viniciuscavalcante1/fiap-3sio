package loops.mapFilterReduce

fun main() {
    val numbers = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    // filter is a lambda function that returns a new list with the elements that satisfy the condition
    // it uses { } to define the lambda function
    val even = numbers.filter {
        it % 2 == 0
    }

    println(even)

    val fruits = listOf("Apple", "Banana", "Orange", "Mango", "Melon")
    val fruitsM = fruits.filter {
        it.startsWith("M")
    }
    println(fruitsM)

}