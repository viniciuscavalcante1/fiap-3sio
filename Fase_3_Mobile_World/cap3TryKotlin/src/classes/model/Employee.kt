package classes.model

class Employee: Person() {
    var salary: Double = 0.0
    var role: String = ""

    override fun printPerson() {
        println("Name: $name")
        println("Date of Birth: $dateBirth")
        println("Weight: $weight")
        println("Height: $height")
        println("Age: $age")
        println("Role: $role")
        println("Salary: $salary")
        println("-------------------------------")
    }
}