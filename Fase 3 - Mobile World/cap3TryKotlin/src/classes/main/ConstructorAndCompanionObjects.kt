package classes.main

class Person constructor(var name: String, var isMale: Boolean, var age: Int = 0) {

    //Métodos de classe
    fun speak(sentence: String) {
        if (age < 3) {
            println("gugu dada")
        } else {
            println(sentence)
        }
    }

    fun introduce() = println("\nOlá, meu nome é $name e tenho $age anos de idade.")

    companion object {
        var animalClass: String = "Mamífero"

        fun getInfo(): String {
            return "Pessoa: ${Person.animalClass} que possui nome, sexo e idade."
        }
    }
}

fun main(args: Array<String>) {

    //Instanciando a classe Person
    var pac = Person("Pedro Alvares Cabral", true)

    //Impressão dos valores antes de alterar a idade
    pac.introduce()
    pac.speak("Olá, tudo bem?")

    //Alterando uma propriedade de pac
    pac.age = 45

    //Impressão dos valores depois de alterar a idade
    pac.introduce()

    //Utilizando o método speak
    pac.speak("Treinamento Kotlin")
    println(Person.animalClass)
    println(Person.getInfo())
}