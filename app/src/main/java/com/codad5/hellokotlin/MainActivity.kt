package com.codad5.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et : EditText = findViewById(R.id.editTextText)


        // button
        val btn : Button = findViewById(R.id.button)

        // handle click event
        btn.setOnClickListener {
            val editTextInput = et.text
            val tv : TextView = findViewById(R.id.textView2)
            tv.setText("Hello, $editTextInput")
            // get the text from the EditText
            Toast.makeText(this@MainActivity , "Button Clicked", Toast.LENGTH_LONG).show()
        }
    }
}