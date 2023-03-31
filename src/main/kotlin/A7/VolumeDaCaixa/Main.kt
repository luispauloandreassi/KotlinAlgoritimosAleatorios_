package A7.VolumeDaCaixa

import java.util.*

fun main(){

    var scanner = Scanner(System.`in`)

    println("Bem-vindo ao programa que calcula o volume de uma caixa retangular")
    print("Informe o Comprimento: ")
    var comprimento = scanner.nextDouble()
    print("Informe a Largura: ")
    var largura = scanner.nextDouble()
    print("Informe a Altura: ")
    var altura = scanner.nextDouble()

    println("------------------")
    println("VOLUME: " + calcularVolume(comprimento,largura,altura))
    println("------------------")
}