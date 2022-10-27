package com.example.randomsalasproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth



class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val regToHome: Button = findViewById(R.id.vamos)
        regToHome.setOnClickListener {
            startActivity(Intent(this,Home::class.java))
        }
        val regToLog: ImageView = findViewById(R.id.back)
        regToLog.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

        setup()
    }

    private fun setup() {
        title = "Autenticación"
        val campoEmail: TextView =findViewById(R.id.editTextTextEmailReg)
        val campoPassword: TextView =findViewById(R.id.editTextTextPasswordReg)
        val campoPasswordRepeat: TextView =findViewById(R.id.editTextTextPassword2Reg)
        val campoName: TextView =findViewById(R.id.editTextTextPersonNameReg)
        val campoGustos: TextView =findViewById(R.id.gustosEditTextViewReg)
//Register Button
        val registrando: Button = findViewById(R.id.vamos)
        registrando.setOnClickListener {
            if (campoEmail.text.isNotEmpty() && campoPassword.text.isNotEmpty()==campoPasswordRepeat.text.isNotEmpty() && campoName.text.isNotEmpty() && campoGustos.text.isNotEmpty()){
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(campoEmail.text.toString(),campoPassword.text.toString()).addOnCompleteListener{
                    if(it.isSuccessful){
                        showHome(it.result?.user?.email?:"",ProviderType.BASIC)
                    }else{
                        showAlert()
                    }
                }
            }
        }

    }

    private fun showAlert(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Se ha producido un error autenticando al usuario")
        builder.setPositiveButton("Aceptar",null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun showHome(email: String, provider: ProviderType){
        val homeIntent = Intent(this, Home::class.java).apply{
            putExtra("email",email)
            putExtra("provider",provider.name)

        }
        startActivity(homeIntent)
    }
}