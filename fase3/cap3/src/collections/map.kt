package collections

fun main() {
    val products = HashMap<String, Double>()
    // Old, but still works
    products.put("Switch", 1999.99)

    // Preferred way
    products["Keyboard"] = 499.99
    products["Table"] = 399.99

    println("Products HashMap size: ${products.size}")

    products.remove("Table")
    products.remove("Switch", 1999.99)

    println("Products HashMap: $products")

    // Old, but still works
    println("Keyboard price: ${products.get("Keyboard")}")

    // Preferred way
    println("Table price: ${products["Table"]}")

    // With pair
    val movies = HashMap<String, Double>()
    val movieCatalog = mapOf(
        "The Godfather" to 9.2,
        "Harry Potter" to 8.0,
        "The Lord of the Rings" to 9.0
    )
    movies.putAll(movieCatalog)

    val books = HashMap<String, Double>()
    val bookCatalog = mapOf(
        Pair("The Catcher in the Rye", 9.0),
        Pair("1984", 8.5),
        Pair("The Great Gatsby", 8.7)
    )

    // IF contains key
    if (books.containsKey("1984")) {
        println("1984 is in the books HashMap")
    } else {
        println("1984 is not in the books HashMap")
    }

    // Key and value accessing
    for (book in books) {
        println(book.key)
        println(book.value)
    }
}