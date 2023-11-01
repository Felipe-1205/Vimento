package com.example.vimento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vimento.databinding.ActivityMainBinding
import com.example.vimento.databinding.ActivityRegistrarPacienteBinding

class RegistrarPaciente : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrarPacienteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrarPacienteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.iniciarSesion.setOnClickListener() {
            startActivity(Intent(this, MenuPrincipal::class.java))
        }
    }
}