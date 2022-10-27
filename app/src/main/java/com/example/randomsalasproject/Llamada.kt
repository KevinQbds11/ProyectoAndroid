package com.example.randomsalasproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Llamada : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_llamada)

        val callToHome: ImageView = findViewById(R.id.homeLogOut)
        callToHome.setOnClickListener {
            startActivity(Intent(this,Home::class.java))
        }
    }
}