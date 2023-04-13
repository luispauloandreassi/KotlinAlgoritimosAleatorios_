package Exercicio19

fun main() {
    println("Digite os algorismos romanos que deseja ver, os algorismos sao: I V X L C D M")
    val s = readLine()?.toUpperCase()?.filter { it in 'A'..'Z' }
    val result = s?.let { romanToInt(it) }
    println(result)
}

fun romanToInt(s: String): Int {
    var sum = 0
    var prev = 0
    for (i in s.length - 1 downTo 0) {
        val curr = getValue(s[i])
        if (curr < prev) {
            sum -= curr
        } else {
            sum += curr
        }
        prev = curr
    }
    return sum
}

fun getValue(c: Char): Int {
    when (c) {
        'I' -> return 1
        'V' -> return 5
        'X' -> return 10
        'L' -> return 50
        'C' -> return 100
        'D' -> return 500
        'M' -> return 1000
        else -> return 0
    }
}