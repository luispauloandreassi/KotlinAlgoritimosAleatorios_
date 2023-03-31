package A5.AreaDeUmaCircunferencia

import java.util.*

fun main(){

    val pi = 3.14159265

    println("Bem-vindo ao programa que calcula Circunferencia")
    var scanner = Scanner(System.`in`)
    print("Informe o valor do raio: ")
    var raio = scanner.nextDouble()

    println("Valor da Circunferencia: " + calcularCircunferencia(pi, raio))
}