package Exercicio17

fun main() {
    println("Digite uma palavra, frase ou número:")
    val palavra = readLine()!!.toString()

    val palavraInvertida = palavra.reversed()

    val ehPalindromo = palavra == palavraInvertida

    println("Palavra/Frase/Numero: $palavra")
    println("Palavra/Frase/Numero invertida: $palavraInvertida")
    println("É um palíndromo? $ehPalindromo")
}