package Exercicio18

fun main() {
    val letras = mapOf(
        'A' to 1, 'E' to 1, 'I' to 1, 'O' to 1, 'U' to 1, 'L' to 1, 'N' to 1, 'R' to 1, 'S' to 1, 'T' to 1,
        'D' to 2, 'G' to 2,
        'B' to 3, 'C' to 3, 'M' to 3, 'P' to 3,
        'F' to 4, 'H' to 4, 'V' to 4, 'W' to 4, 'Y' to 4,
        'K' to 5,
        'J' to 8, 'X' to 8,
        'Q' to 10, 'Z' to 10
    )

    print("Digite uma palavra: ")
    val palavra = readLine()?.toUpperCase()?.filter { it in 'A'..'Z' }

    var score = 0
    if (palavra != null) {
        for (letra in palavra) {
            score += letras[letra] ?: 0
        }
    }

    println("Scrabble Score da palavra $palavra é $score")
}