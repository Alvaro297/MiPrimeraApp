package com.example.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //comentario
        Log.e("MainActivity", "Se ha creado correctamente")
        Toast.makeText(this, getString(R.string.Hello), Toast.LENGTH_LONG)
        Log.e("MainActivity", "Se ha creado correctamente")
    }
}