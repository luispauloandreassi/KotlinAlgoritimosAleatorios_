package A2.TrocaTroca

import A1.TwoFer.twofer
import java.util.*

fun main(){

    println("Bem-vindo ao programa Troca Troca")
    var scanner = Scanner(System.`in`)
    print("Informe um valor: ")
    var valor1 = scanner.nextLine()
    print("Informe outro valor: ")
    var valor2 = scanner.nextLine()

    println("\nValores Originais:")
    println("Valor1: " + valor1)
    println("Valor2: " + valor2)

    val transitoria : String? = valor1
    valor1 = valor2
    valor2 = transitoria

    println("\nValores Apos a Troca:")
    println("Valor1: " + valor1)
    println("Valor2: " + valor2)


}
