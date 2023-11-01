package com.example.vimento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vimento.databinding.ActivityCambiarInfoPacienteBinding
import com.example.vimento.databinding.ActivityMainBinding

class CambiarInfoPaciente : AppCompatActivity() {
    private lateinit var binding: ActivityCambiarInfoPacienteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCambiarInfoPacienteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}