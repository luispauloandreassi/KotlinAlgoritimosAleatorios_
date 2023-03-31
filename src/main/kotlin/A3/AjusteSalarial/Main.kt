package A3.AjusteSalarial

import java.util.*

fun main(){
    println("Bem-vindo ao programa que calcula o Ajuste Salarial")
    var scanner = Scanner(System.`in`)
    print("Informe o Valor de um Salario: ")
    var salario = scanner.nextDouble()
    print("Informe o percentual de reajuste salarial: ")
    var percentual = scanner.nextDouble()

    println("\nNOVO SALARIO: " + calcularSalario (salario, percentual))


}

