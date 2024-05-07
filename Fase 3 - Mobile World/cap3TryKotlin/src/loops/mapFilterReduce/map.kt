package loops.mapFilterReduce

// map iterates through the list and applies the lambda function to each element
// the difference between map and filter is that map returns a new list with the results of the lambda function
// while filter returns a new list with the elements that satisfy the condition

fun main() {
    var fruits = listOf("apple", "banana", "orange", "mango", "melon")
    var fruitsUppercase = fruits.map {
        it.uppercase()
    }
    println(fruitsUppercase)
}


