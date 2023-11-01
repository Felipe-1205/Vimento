package com.example.vimento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vimento.databinding.ActivityMainBinding
import com.example.vimento.databinding.ActivityMenuPacienteBinding

class MenuPaciente : AppCompatActivity() {
    private lateinit var binding: ActivityMenuPacienteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuPacienteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.modousuario.setOnClickListener() {
            startActivity(Intent(this, ActividadFamilia::class.java))
        }
    }
}