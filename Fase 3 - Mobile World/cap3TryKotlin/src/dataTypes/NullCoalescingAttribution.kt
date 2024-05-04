package dataTypes

fun main() {
    var age: Int? = null
    var myAge = age ?: 0
    println("My age is: $myAge")

    age = 25
    myAge = age ?: 0
    println("My age is: $myAge")
}