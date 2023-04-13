package Exercicio14

fun main() {
    println("Digite as quatro notas do aluno:")
    val nota1 = readLine()!!.toDouble()
    val nota2 = readLine()!!.toDouble()
    val nota3 = readLine()!!.toDouble()
    val nota4 = readLine()!!.toDouble()

    val media = (nota1 + nota2 + nota3 + nota4) / 4

    if (media >= 5) {
        println("Aprovado")
    } else {
        println("Reprovado")
    }
    println("Média obtida pelo aluno: $media")
}