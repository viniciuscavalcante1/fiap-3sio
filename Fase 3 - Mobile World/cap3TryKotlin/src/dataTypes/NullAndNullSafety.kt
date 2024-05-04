package dataTypes

fun main() {

    // in order to create nullable variables, we have to insert '?' after the variable type,
    // and we must specify the variable type when creating null variables, because if we don't,
    // the inferred type will be "Nothing?".
    // this is called null safety!

    val test: Nothing? = null
    var age: Int? = null

}