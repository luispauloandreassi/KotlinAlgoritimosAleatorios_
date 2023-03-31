package A3.AjusteSalarial

import jdk.jfr.Percentage

fun calcularSalario(salario : Double, percentual : Double): Double {
    return salario + (salario * percentual/100)

}