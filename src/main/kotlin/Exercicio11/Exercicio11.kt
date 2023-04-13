package Exercicio11

fun main() {
    print("Digite o primeiro valor: ")
    val valor1 = readLine()!!.toInt()
    print("Digite o segundo valor: ")
    val valor2 = readLine()!!.toInt()
    print("Digite o terceiro valor: ")
    val valor3 = readLine()!!.toInt()

    val soma = valor1 + valor2 + valor3
    val quadradoSoma = soma * soma

    println("O quadrado da soma dos valores é: $quadradoSoma")
}