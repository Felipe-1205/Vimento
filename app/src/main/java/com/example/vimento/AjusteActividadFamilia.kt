package com.example.vimento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vimento.databinding.ActivityAgendaBinding
import com.example.vimento.databinding.ActivityAjusteActividadFamiliaBinding

class AjusteActividadFamilia : AppCompatActivity() {
    private lateinit var binding: ActivityAjusteActividadFamiliaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAjusteActividadFamiliaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button4.setOnClickListener() {
            startActivity(Intent(this, AjusteActividadFamiliaAgregar::class.java))
        }
    }
}