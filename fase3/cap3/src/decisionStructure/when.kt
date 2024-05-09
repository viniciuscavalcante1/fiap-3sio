package decisionStructure

fun main() {
    val grade = 7.5
    val result = when {
        grade >= 7.0 -> "Approved"
        grade >= 4.0 -> "Recovery"
        else -> "Disapproved"
    }
    println(result)

    val number = 2
    when (number % 2) {
        0 -> println("Even")
        else -> println("Odd")
    }

    val letter = "a"
    when (letter) {
        "a", "e", "i", "o", "u" -> println("Vowel")
        else -> println("Consonant")
    }


}

