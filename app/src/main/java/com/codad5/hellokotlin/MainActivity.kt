package com.codad5.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.textView2).text = ""
        val et : EditText = findViewById(R.id.editTextText)
        // button
        val btn : Button = findViewById(R.id.button)

        // handle click event
        btn.setOnClickListener {
            val editTextInput = et.text
            // get the text from the EditText
            Toast.makeText(this@MainActivity , "Hello $editTextInput", Toast.LENGTH_LONG).show()
            rollDice()
        }

        this.diceImage = findViewById(R.id.imageView)
    }

    private fun rollDice() {
        val tv : TextView = findViewById(R.id.textView2)
        val randomNumber = Random().nextInt(6 ) + 1
        val drawableResource = when (randomNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_1
        }
        tv.text = "$randomNumber"
        this.diceImage.setImageResource(drawableResource)
    }
}