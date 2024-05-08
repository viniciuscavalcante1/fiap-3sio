package loops.mapFilterReduce

fun main() {

    // Reduce iterates through the list and applies the lambda function to each element
    // the difference between reduce and map is that reduce returns a single value
    // while map returns a new list with the results of the lambda function
    // reduce takes an initial value and an accumulator
    // the accumulator is the result of the lambda function applied to the previous element
    // the initial value is the first value of the accumulator
    // reduce uses { } to define the lambda function

    // closures are used to define the lambda function

    var numbers = listOf(1, 2, 3, 4, 5)
    var sum = numbers.reduce { acc, i -> acc + i }
    println(sum)
}