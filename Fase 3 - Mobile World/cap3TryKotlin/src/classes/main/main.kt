package classes.main

import classes.model.Person
import java.time.LocalDate

fun main() {
    val person = Person()
    person.name = "Vinícius"
    person.height = 1.71
    person.weight = 73.0
    person.dateBirth = LocalDate.of(1999, 6, 12)

    person.printPerson()

    val person2 = Person()
    person2.name = "Luke"
    person2.height = 1.3
    person2.weight = 83.0
    person2.dateBirth = LocalDate.of(1999, 6, 13)

    person2.printPerson()
}