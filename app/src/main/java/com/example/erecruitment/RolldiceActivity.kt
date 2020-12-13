package com.example.erecruitment

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.erecruitment.R.id.image_view_dice
import java.util.*

class RolldiceActivity : AppCompatActivity() {
    private lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rolldice)

        val dice: ImageView = findViewById(image_view_dice)
        dice.setOnClickListener {
            rollDice()
        }
        diceImage = findViewById(image_view_dice)
    }
    private fun rollDice() {
        val drawableResource = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        diceImage.setImageResource(drawableResource)
    }
}