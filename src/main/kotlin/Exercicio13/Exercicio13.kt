package Exercicio13

fun main() {
    print("Digite a quantidade de votos válidos do candidato A: ")
    val votosA = readLine()!!.toInt()

    print("Digite a quantidade de votos válidos do candidato B: ")
    val votosB = readLine()!!.toInt()

    print("Digite a quantidade de votos válidos do candidato C: ")
    val votosC = readLine()!!.toInt()

    print("Digite a quantidade de votos nulos: ")
    val votosNulos = readLine()!!.toInt()

    print("Digite a quantidade de votos em branco: ")
    val votosBrancos = readLine()!!.toInt()

    val totalEleitores = votosA + votosB + votosC + votosNulos + votosBrancos

    val percentualValidos = (100 * (votosA + votosB + votosC)) / totalEleitores
    val percentualA = (100 * votosA) / totalEleitores
    val percentualB = (100 * votosB) / totalEleitores
    val percentualC = (100 * votosC) / totalEleitores
    val percentualNulos = (100 * votosNulos) / totalEleitores
    val percentualBrancos = (100 * votosBrancos) / totalEleitores

    println("Número total de eleitores: $totalEleitores")
    println("Percentual de votos válidos: $percentualValidos%")
    println("Percentual de votos do candidato A: $percentualA%")
    println("Percentual de votos do candidato B: $percentualB%")
    println("Percentual de votos do candidato C: $percentualC%")
    println("Percentual de votos nulos: $percentualNulos%")
    println("Percentual de votos em branco: $percentualBrancos%")
}