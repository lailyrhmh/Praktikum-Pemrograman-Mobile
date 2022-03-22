package prak1

import java.util.*
import kotlin.random.Random

fun main() {
    val input = Scanner(System.`in`)

    print("Waktu Sekarang: ")
    var waktu: String = input.nextLine()

    print("Nama Anda: ")
    var nama: String = input.nextLine()

    print("Umur Anda: ")
    var umur: Int = input.nextInt()

    fun randomeSuhu(min: Int, max: Int): Double {
        require(min < max) { "Invalid range [$min, $max]" }
        return (min + Random.nextFloat() * (max - min)).toDouble()
    }

    print("Suhu Tubuh Anda: ")
    val min = 35
    val max = 37
    val suhu = randomeSuhu(min, max)

    println("Selamat $waktu, $nama.")
    println("Umur anda $umur Tahun.")
    println("Suhu Tubuh anda %.1f derajat celsius".format(suhu))
}