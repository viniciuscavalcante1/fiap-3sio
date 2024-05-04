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
}