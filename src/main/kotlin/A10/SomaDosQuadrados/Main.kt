package A10.SomaDosQuadrados

import java.util.*

fun main(){

    var scanner = Scanner(System.`in`)

    println("Bem-vindo ao programa que calcula a soma dos Quadrados!")
    println("Favor informar 3 valores numericos inteiros:  ")
    print("Valor 1: ")
    var valor1 = scanner.nextInt()
    print("Valor 2: ")
    var valor2 = scanner.nextInt()
    print("Valor 3: ")
    var valor3 = scanner.nextInt()

    println("---------------------")
    println("RESULTADO: " + calcular(valor1, valor2, valor3))
    println("---------------------")

}