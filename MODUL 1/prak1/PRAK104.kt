package prak1

class PRAK104(){
    val vehicle: String = "Mobil"
    val fuel: Int = (0..100).random()


    fun on(){
        println("$vehicle is On")
    }

    fun off(){
        println("$vehicle is off")
    }

    fun fuelStatus(){
        if (fuel==0){
            println("fuel status is empty")
        }
        else if (fuel>0 && fuel<100){
            println("fuel status is $fuel percent")
        }
        else{
            println("fuel status is full")
        }
    }
}

fun main() {
    val PRAK104 = PRAK104()
    PRAK104.on()
    PRAK104.fuelStatus()
    PRAK104.off()
}