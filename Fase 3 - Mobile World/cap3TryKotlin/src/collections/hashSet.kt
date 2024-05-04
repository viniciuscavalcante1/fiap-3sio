package collections

fun main() {
    // hashSet is a collection that contains unique elements
    // hashSet is also ordered by default, but we can't guarantee the order and it can change

    val movies = HashSet<String>()
    println("Movies HashSet size: ${movies.size}")

    movies.add("The Godfather")
    movies.add("Harry Potter")

    println("Contains Harry Potter: ${movies.contains("Harry Potter")}")

    movies.remove("Harry Potter")
    println("Contains Harry Potter: ${movies.contains("Harry Potter")}")
    println("Movies HashSet: $movies")

    val cars = setOf("Ferrari", "Lamborghini", "Porsche")

    val numbers = HashSet<Int>()
    val numbersList = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    numbers.addAll(numbersList)
}