package A10.SomaDosQuadrados

import kotlin.math.pow

fun calcular(valor1: Int, valor2: Int, valor3: Int) : Double{
    var resultado = valor1.toDouble().pow(2) + valor2.toDouble().pow(2) + valor3.toDouble().pow(2)

    return resultado
}

