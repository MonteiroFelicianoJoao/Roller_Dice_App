package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.diceroller.R.string.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        (getString(dice1_text) + " " + diceRoll.toString()).also { resultTextView.text = it }

        val dice1 = Dice(6)
        val diceRoll1 = dice1.roll()
        val resultTextView2: TextView = findViewById(R.id.textView2)
        (getString(dice2_text) + " " + diceRoll1.toString()).also { resultTextView2.text = it }
    }
}

class Dice (private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}