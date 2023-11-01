package com.example.vimento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vimento.databinding.ActivityActividadFamiliaBinding
import com.example.vimento.databinding.ActivityAgendaBinding

class ActividadFamilia : AppCompatActivity() {
    private lateinit var binding: ActivityActividadFamiliaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActividadFamiliaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.modousuario.setOnClickListener() {
            startActivity(Intent(this, ActividadFamiliaAntesDespues::class.java))
        }
        binding.modousuario1.setOnClickListener() {
            startActivity(Intent(this, ActividadFamiliaAntesDespues::class.java))
        }
    }
}