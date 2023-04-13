package Exercicio20

fun main() {
    val opcoes = arrayOf("pedra", "papel", "tesoura")
    println("Jogo do Jokenpo!")
    println("Escolha sua jogada: (pedra, papel ou tesoura)")
    val player1 = readLine()?.toLowerCase()

    if (player1 !in opcoes) {
        println("Opção inválida.")
        return
    }

    val computador = opcoes.random()
    println("O computador escolheu $computador")

    when {
        player1 == computador -> println("Empate!")
        player1 == "pedra" && computador == "tesoura" ||
                player1 == "tesoura" && computador == "papel" ||
                player1 == "papel" && computador == "pedra" -> println("Você ganhou!")
        else -> println("Você perdeu!")
    }
}