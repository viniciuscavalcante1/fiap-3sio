package loops

fun main() {
    var tries = 0
    var diceNumber = 0
    do {
        diceNumber = (1..6).random()
        tries++
        println("Dice number: $diceNumber, tries: $tries")
    } while (diceNumber != 6)

}