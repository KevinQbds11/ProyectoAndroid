package com.example.randomsalasproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val homeToLog: ImageView = findViewById(R.id.signOut)
        homeToLog.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
        val homeToTrend: ImageView = findViewById(R.id.trendButton)
        homeToTrend.setOnClickListener {
            startActivity(Intent(this,Trending::class.java))
        }
        val homeToMusic: ImageView = findViewById(R.id.musicButton)
        homeToMusic.setOnClickListener {
            startActivity(Intent(this,Llamada::class.java))
        }
        val homeToEcono: ImageView = findViewById(R.id.econoButton)
        homeToEcono.setOnClickListener {
            startActivity(Intent(this,Llamada::class.java))
        }
        val homeToGame: ImageView = findViewById(R.id.gameButton)
        homeToGame.setOnClickListener {
            startActivity(Intent(this,Llamada::class.java))
        }
        val homeToRand: ImageView = findViewById(R.id.randButton)
        homeToRand.setOnClickListener {
            startActivity(Intent(this,Llamada::class.java))
        }

    }
}