package com.example.vimento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vimento.databinding.ActivityLoginPacienteBinding
import com.example.vimento.databinding.ActivityMainBinding

class LoginPaciente : AppCompatActivity() {
    private lateinit var binding: ActivityLoginPacienteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginPacienteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.iniciarSesion.setOnClickListener() {
            startActivity(Intent(this, MenuPrincipal::class.java))
        }
        binding.texo.setOnClickListener() {
            startActivity(Intent(this, RegistrarPaciente::class.java))
        }
    }
}