package A6.SalarioLíquidoProfessor

fun salarioBruto (horasTrab: Double, valorHoraAula: Double) : Double{
    return horasTrab * valorHoraAula
}

fun salarioLiquido (salarioBruto: Double, percINSS: Double):Double{
    val valorDesconto = salarioBruto * (percINSS/100)

    return salarioBruto - valorDesconto
}
