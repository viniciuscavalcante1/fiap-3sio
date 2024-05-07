package classes.main

open class Person2 (var name: String, var isMale: Boolean, var age: Int = 0) {

    //Métodos de classe
    fun speak(sentence: String) {
        if (age < 3) {
            println("gugu dada")
        } else {
            println(sentence)
        }
    }

    fun introduce() = println("\nOlá, meu nome é $name e tenho $age anos de idade.")

    //Propriedade computada
    val gender: String
        get() {
        if (isMale) {
            return "masculino"
        } else {
            return "feminino"
        }
    }

    //palavras reservadas dentro da classe
    //que habilitam propriedades e métodos
    //que podem ser acessados diretamente.
    companion object {

        //Propriedade de classe (estática)
        var animalClass: String = "mamífero"

        //Método de classe
        fun getInfo() : String {
            return "Pessoa: ${Person2.animalClass} que possui nome, sexo e idade"
        }

    }

}

//HERANÇA
class Student : Person2 {
    constructor (name: String, isMale: Boolean, age: Int = 0, rm: String) : super(name,isMale,age) {
    }
}


fun main(args: Array<String>) {


    //Instanciando a classe Person
    var pac = Person2("Pedro Alvares Cabral", true)

    //Impressão dos valores antes de alterar a idade
    pac.introduce()

    //Alterando uma propriedade de pac
    pac.age = 45

    //Impressão dos valores depois de alterar a idade
    pac.introduce()

    //Utilizando o método speak
    pac.speak("Treinamento Kotlin")

    println(pac.gender)

    println(Person2.animalClass) //mamífero

    println(Person2.getInfo())
    //Pessoa: mamífero que possui nome, sexo e idade

    var student = Student("Pedrinho Cabral", false, 10,"97663")
    student.introduce();
}