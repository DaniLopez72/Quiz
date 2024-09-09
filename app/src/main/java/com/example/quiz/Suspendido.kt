package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Suspendido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.suspendido)
        lateinit var volver: Button;
        volver=findViewById(R.id.button3)
        volver.setOnClickListener{
            volverInicio()
        }
    }
    private fun volverInicio(){
        val i = Intent(this,Inicio::class.java)
        startActivity(i)
    }
}