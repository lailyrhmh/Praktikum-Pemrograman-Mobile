package prak1

import java.util.*

fun function(x: Int): Int {
    val y = (2*x*x) + (5*x) - 8
    return y
}

fun main() {
    val input = Scanner(System.`in`)

    print("Nilai x: ")
    var x = input.nextInt()

    println(function(x))
}