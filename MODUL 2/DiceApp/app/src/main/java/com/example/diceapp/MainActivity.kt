package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // untuk menampilkan gambar dadu kosong
        val defaultImage1: ImageView = findViewById(R.id.imageView)
        val defaultImage2: ImageView = findViewById(R.id.imageView2)
        defaultImage1.setImageResource(R.drawable.empty_dice)
        defaultImage2.setImageResource(R.drawable.empty_dice)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll1 = dice.roll() // objek 1
        val diceRoll2 = dice.roll() // objek 2

        val toast1 = Toast.makeText(this, "Anda belum beruntung!", Toast.LENGTH_SHORT)
        val toast2 = Toast.makeText(this, "Selamat anda dapat dadu double!", Toast.LENGTH_SHORT)

        // find imageView in the layout
        val diceImage1: ImageView = findViewById(R.id.imageView)
        val diceImage2: ImageView = findViewById(R.id.imageView2)

        if (diceRoll1 == diceRoll2) {
            toast2.show()
        }
        else {
            toast1.show()
        }

        val drawableResource1 = when (diceRoll1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val drawableResource2 = when (diceRoll2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // update image sesuai angka acak
        diceImage1.setImageResource(drawableResource1)
        diceImage2.setImageResource(drawableResource2)

        // update deskripsi konten
        diceImage1.contentDescription = diceRoll1.toString()
        diceImage2.contentDescription = diceRoll2.toString()
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}