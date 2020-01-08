package com.example.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        roll_button.setOnClickListener{
            rolldice()
        }
    }
    private fun rolldice(){
        val randomint= Random.nextInt(6)+1
        resultext.text=randomint.toString()
        val diceimage:ImageView = findViewById(R.id.dice_image)
        val drawableresource =when(randomint)
        {
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
       diceimage.setImageResource(drawableresource)
    }
}
