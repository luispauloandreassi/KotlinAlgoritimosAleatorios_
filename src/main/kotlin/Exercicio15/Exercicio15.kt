package Exercicio15

fun main() {
    val inicioIntervalo = 1
    val fimIntervalo = 100
    var soma = 0

    println("Intervalo informado: [$inicioIntervalo, $fimIntervalo]")

    for (i in inicioIntervalo..fimIntervalo) {
        soma += i
    }

    println("Soma dos valores do intervalo: $soma")
}