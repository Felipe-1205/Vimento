package com.example.vimento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vimento.databinding.ActivitySeleccionarPacienteBinding

class SeleccionarPaciente : AppCompatActivity() {
    private lateinit var binding: ActivitySeleccionarPacienteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeleccionarPacienteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.cardActividad.setOnClickListener() {
            startActivity(Intent(this, MenuPrincipal::class.java))
        }
        binding.button3.setOnClickListener() {
            startActivity(Intent(this, LoginPaciente::class.java))
        }
    }
}