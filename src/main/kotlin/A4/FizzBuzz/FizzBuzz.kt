package A4.FizzBuzz

fun fizzBuzz (valorInicial: Int, numeroFinal: Int) {

    println("Apresentacao: ")
    for (i in valorInicial..numeroFinal) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}