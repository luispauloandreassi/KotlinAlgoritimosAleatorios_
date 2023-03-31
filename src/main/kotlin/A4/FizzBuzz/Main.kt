package A4.FizzBuzz

import java.util.*

fun main(){

    println("Bem-vindo ao programa FizzBuzz")
    var scanner = Scanner(System.`in`)
    println("Favor informar um intervalo de números: ")
    print("Numero Inicial: ")
    var numeroInicial = scanner.nextInt()
    print("Numero Final: ")
    var numeroFinal = scanner.nextInt()

    fizzBuzz (numeroInicial, numeroFinal)
}