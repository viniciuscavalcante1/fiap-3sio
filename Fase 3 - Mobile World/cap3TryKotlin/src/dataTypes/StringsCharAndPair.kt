package dataTypes

fun main() {
    // list of characters in double quotes
    var name = "Vini"
    println(name)
    name = "Maria"
    println(name)

    // len
    println(name.length)

    var city: String = "São Paulo"
    println("City name: $city")
    println(city.length)

    // char
    // string holds a large space in memory
    // if we want to store just a single letter, we can use char type
    // e.g. masculine or feminine (m or f)
    // in char, we use only single-quoted values

    var type: Char = 'x'

    // pair
    // holds up to 2 values in a single variable, usually used to return two values from different types

    var (code, description) = Pair(100, "Mouse")
    println(code)
    println(description)

    var product2: Pair<Int, String> = Pair(200, "Keyboard")
    println(product2.first)
    println(product2.second)
    println(product2)

    // tabulation, carriage return and special characters
    var text = "This text \"breaks\" in two \nlines!"
    println(text)

    // string interpolation (concat)
    val student = "Vini"
    val grade = 10
    val result = "approved"
    println("The student $student grade is $grade and he is $result")
}