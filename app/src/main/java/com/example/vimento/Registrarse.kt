package com.example.vimento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vimento.databinding.ActivityMainBinding
import com.example.vimento.databinding.ActivityRegistrarseBinding

class Registrarse : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrarseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrarseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button6.setOnClickListener() {
            startActivity(Intent(this, Login::class.java))
        }
        binding.iniciarSesion.setOnClickListener() {
            startActivity(Intent(this, SeleccionarPaciente::class.java))
        }
    }
}