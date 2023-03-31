package A6.SalarioLíquidoProfessor

import java.util.*

fun main(){

    var scanner = Scanner(System.`in`)

    println("Bem-vindo ao programa que calcula o Salario do Professor")
    print("Informe o numero de horas Trabalhadas: ")
    var nunHoras = scanner.nextDouble()
    print("Informe o Valor da hora-aula: ")
    var valorHoraAula = scanner.nextDouble()
    print("Informe o Percentual de desconto do INSS: ")
    var percINSS = scanner.nextDouble()

    println("------------------------------------------")
    println("Valor do Salario Bruto      : " + salarioBruto(nunHoras, valorHoraAula))
    println("Valor do Desconto INSS("+percINSS.toInt()+"%) : " + (salarioBruto(nunHoras, valorHoraAula)) * percINSS/100)
    println("Valor do Salario Liquido    : " + salarioLiquido(salarioBruto(nunHoras, valorHoraAula),percINSS))
    println("------------------------------------------")
}