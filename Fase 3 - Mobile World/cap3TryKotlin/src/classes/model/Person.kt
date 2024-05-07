package classes.model

import java.time.LocalDate

open class Person {
    // Object properties
    var name: String = ""
    var dateBirth: LocalDate = LocalDate.now()
    var weight: Double = 0.0
    var height: Double = 0.0
    val age: Int
        get() {
          return LocalDate.now().year - dateBirth.year
        }
    // Object methods
    open fun printPerson() {
        println("Name: $name")
        println("Date of Birth: $dateBirth")
        println("Weight: $weight")
        println("Height: $height")
        println("Age: $age")
//        println("Age: ${calculateAge()}")
        println("-------------------------------")
    }
//
//    fun calculateAge(): Int {
//        return LocalDate.now().year - dateBirth.year
//    }
}