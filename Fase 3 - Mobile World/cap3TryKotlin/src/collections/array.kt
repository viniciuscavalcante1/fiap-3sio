package collections

fun main() {
    // Arrays are fixed size, and we can't change their size
    // We can't change the type of the elements in an array
    // Kotlin infers the type of the array based on the elements, with dynamic typing
    // We also have array positions, starting from 0
    // Kotlin also automatically casts different types of elements in an array to the same,
    // first common type, but only if we don't specify the type of the array beforehand

    // If we want to add elements to an array, we should use an ArrayList
    val cities = arrayOf("São Paulo", "Rio de Janeiro", "Curitiba", 300)
    val states = arrayOf<String>("São Paulo", "Rio de Janeiro", "Paraná")


    println(cities[1])
    println(cities[0])
    cities[0] = "Florianópolis"
    println(cities[0])

    // Array operations
    println(cities.size)
    println(cities.contains("Curitiba"))
    println(cities.reversed())
    println(cities.shuffle())
    println(cities.last())
    println(cities.first())
    println(cities.isEmpty())
}