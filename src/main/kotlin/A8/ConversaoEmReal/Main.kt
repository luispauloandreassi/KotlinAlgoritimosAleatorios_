package A8.ConversaoEmReal

import java.util.*

fun main(){
    var scanner = Scanner(System.`in`)

    println("Bem-vindo ao programa que faz a Conversao do Dolar-US$ em Real-R$")
    print("Informe o valor da Cotacao do dolar: ")
    var cotacao = scanner.nextDouble()
    print("Informe a quantidade de dolar: ")
    var qtdDolar = scanner.nextDouble()

    println("----------------------------------------------")
    println("Valor da cotacao           : " + cotacao)
    println("Quantidade de Dolar-US$    : " + qtdDolar)
    println("Valor convertido em Real-R$: " + converter(cotacao, qtdDolar))
    println("----------------------------------------------")

}