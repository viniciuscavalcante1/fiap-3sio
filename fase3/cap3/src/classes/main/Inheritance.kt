package classes.main

import classes.model.Employee
import classes.model.Person
import java.time.LocalDate

fun main() {
    var employee = Employee()
    employee.name = "Vinícius"
    employee.height = 1.71
    employee.weight = 73.0
    employee.dateBirth = LocalDate.of(1999, 6, 12)
    employee.role = "Business Analyst"
    employee.salary = 50000000.0
    employee.printPerson()
}