package collections

fun main(){
    val fruits = ArrayList<String>()
    val fruitsSize = fruits.size
    println("Fruits ArrayList Size:' $fruitsSize")
    fruits.add("Apple")
    fruits.add("Apple")
    fruits.add("Apple")
    fruits.add("Apple")
    fruits.add("Apple")
    fruits.add("Banana")
    fruits.add("Orange")
    fruits.add("Mango")
    println("Fruits ArrayList Size:' $fruitsSize")
    val containsBanana = fruits.contains("Banana")
    val containsGrape = fruits.contains("Grape")
    println("Fruits ArrayList Contains Banana: $containsBanana")
    println("Fruits ArrayList Contains Grape: $containsGrape")
    println("Fruits ArrayList: $fruits")
    fruits.remove("Apple")
    println("Fruits ArrayList: $fruits")
}