package com.example.randomsalasproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        /*val homeToLog: ImageView = findViewById(R.id.signOut)
        homeToLog.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }*/

        //Botones Salas
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

        //setup
        val bundle = intent.extras
        val email = bundle?.getString("email")
        val provider = bundle?.getString("provider")
        setup(email ?:"",provider ?:"")

        //LogOut Button
        val homeToLogout: ImageView = findViewById(R.id.homeLogOut)
        homeToLogout.setOnClickListener {
            showLogout(email.toString(),ProviderType.BASIC)
        }

    }
    private fun setup(email: String,provider: String){

        title="Inicio"
        val emailHome: TextView =findViewById(R.id.emailShow)
        val providerHome: TextView =findViewById(R.id.contactName)

        emailHome.text = email
        providerHome.text = provider
    }
    private fun showLogout(email: String, provider: ProviderType){
        val logOutIntent = Intent(this, Logout::class.java)/*.apply{
            putExtra("email",email)
            putExtra("provider",provider.name)

        }*/
        startActivity(logOutIntent)
    }
}