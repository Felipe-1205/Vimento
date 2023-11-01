package com.example.vimento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vimento.databinding.ActivityActividadFamiliaAntesDespuesBinding
import com.example.vimento.databinding.ActivityAgendaBinding

class ActividadFamiliaAntesDespues : AppCompatActivity() {
    private lateinit var binding: ActivityActividadFamiliaAntesDespuesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActividadFamiliaAntesDespuesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}