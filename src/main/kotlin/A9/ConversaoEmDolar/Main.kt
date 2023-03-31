package A9.ConversaoEmDolar

import java.util.*

fun main(){

    var scanner = Scanner(System.`in`)

    println("Bem-vindo ao programa que faz a Conversao do Real-R$ em Dolar-US$")
    print("Informe o valor da Cotacao do dolar: ")
    var cotacao = scanner.nextDouble()
    print("Informe a quantidade de Reais: ")
    var qtdReal = scanner.nextDouble()

    println("----------------------------------------------")
    println("Valor da cotacao             : " + cotacao)
    println("Quantidade de Real-R$        : " + qtdReal)
    println("Valor convertido em Dolar-US$: " + converter(cotacao, qtdReal))
    println("----------------------------------------------")

}