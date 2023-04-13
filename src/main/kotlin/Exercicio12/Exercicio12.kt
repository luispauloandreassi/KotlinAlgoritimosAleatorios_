package Exercicio12

fun main() {
    val distancia = 10
    val tempo = 5

    val velocidade = (distancia * 1000) / (tempo * 60).toFloat()

    println("A velocidade do projétil é de $velocidade metros por segundo")
}