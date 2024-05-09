fun main() {
    // strings are double-quoted.
    // we use the reserved word 'var' to create a new variable, following by its name, equal and then the value.
    var name = "Vini"
    println("$name is $name")

    // since var stands to variables, it can change its value.
    // we also only use the reserved word 'var' when we are creating the variable.
    // in Kotlin, we also don't have to write the variable type.
    // the value passed already starts the variable with the correct type value by inference.
    // and it can't be changed solely by passing another value type.
    name = "Bru"
    println("Hello $name")
    // incorrect: name = 200

    // but we also can write the variable type if we want, by write : <type> after variable name
    // Byte is a numeric int
    var age: Byte = 19
    println("$age years old")

    // strings is String!
    var company: String = "JetBrains"
    println(company)
}