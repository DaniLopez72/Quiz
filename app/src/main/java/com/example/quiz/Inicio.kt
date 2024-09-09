package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)
        lateinit var iniciar: Button;
        iniciar=findViewById(R.id.button)
        iniciar.setOnClickListener{
            iniciarQuiz()
        }
    }

    private fun iniciarQuiz() {
        val i = Intent(this,MainActivity::class.java)
        startActivity(i)
    }
}