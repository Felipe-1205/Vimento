package com.example.vimento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vimento.databinding.ActivityAgendaBinding
import com.example.vimento.databinding.ActivityAjusteActividadFamiliaAgregarBinding

class AjusteActividadFamiliaAgregar : AppCompatActivity() {
    private lateinit var binding: ActivityAjusteActividadFamiliaAgregarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAjusteActividadFamiliaAgregarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.iniciarSesion.setOnClickListener() {
            startActivity(Intent(this, AjusteActividadFamilia::class.java))
        }
    }
}