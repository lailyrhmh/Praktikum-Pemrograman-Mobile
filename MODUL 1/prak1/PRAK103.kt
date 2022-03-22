package prak1

import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    var i = 0

    val bilangan: Int = input.nextInt()
    var hasil = bilangan
    while (i < 5){
        hasil += bilangan
        if (hasil%2 == 0 || hasil%3 == 0){
            print("$hasil ")
            i++
        }
    }
}