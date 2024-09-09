package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Aprovado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aprovado)
        lateinit var volver: Button;
        volver=findViewById(R.id.button2)
        volver.setOnClickListener{
            volverInicio()
        }
    }
    private fun volverInicio(){
        val i =Intent(this,Inicio::class.java)
        startActivity(i)
    }
}