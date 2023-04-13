package Exercicio16

fun main() {
    val numeros = IntArray(12)

    println("Digite os 12 números a serem ordenados:")
    for (i in 0 until 12) {
        numeros[i] = readLine()!!.toInt()
    }

    numeros.sortDescending()

    println("Números em ordem decrescente:")
    for (numero in numeros) {
        println(numero)
    }
}