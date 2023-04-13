package Exercicio21

fun main() {
    val opcoes = arrayOf("pedra", "papel", "tesoura", "lagarto", "spock")
    println("Jogo do Pedra-papel-tesoura-lagarto-Spock!")
    println("Escolha sua jogada: (pedra, papel, tesoura, lagarto ou spock)")
    val player1 = readLine()?.toLowerCase()

    if (player1 !in opcoes) {
        println("Jogada inválida para o jogador 1.")
        return
    }

    println("Jogada do jogador 1: $player1")
    println("Agora é a vez do jogador 2.")
    val player2 = readLine()?.toLowerCase()

    if (player2 !in opcoes) {
        println("Jogada inválida para o jogador 2.")
        return
    }

    println("Jogada do jogador 2: $player2")

    when {
        player1 == player2 -> println("Empate!")
        player1 == "pedra" && (player2 == "lagarto" || player2 == "tesoura") ||
                player1 == "papel" && (player2 == "pedra" || player2 == "spock") ||
                player1 == "tesoura" && (player2 == "papel" || player2 == "lagarto") ||
                player1 == "lagarto" && (player2 == "papel" || player2 == "spock") ||
                player1 == "spock" && (player2 == "pedra" || player2 == "tesoura") -> println("Jogador 1 venceu!")

        else -> println("Jogador 2 venceu!")
    }
}