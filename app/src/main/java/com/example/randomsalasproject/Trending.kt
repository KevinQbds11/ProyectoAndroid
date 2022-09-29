package com.example.randomsalasproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Trending : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trending)

        val trendToHome: ImageView = findViewById(R.id.backtoHome)
        trendToHome.setOnClickListener {
            startActivity(Intent(this,Home::class.java))
        }
        val conceToCall: ImageView = findViewById(R.id.conceButton)
        conceToCall.setOnClickListener {
            startActivity(Intent(this,Llamada::class.java))
        }
        val valoToCall: ImageView = findViewById(R.id.valoButton)
        valoToCall.setOnClickListener {
            startActivity(Intent(this,Llamada::class.java))
        }
        val compToCall: ImageView = findViewById(R.id.compButton)
        compToCall.setOnClickListener {
            startActivity(Intent(this,Llamada::class.java))
        }
    }
}