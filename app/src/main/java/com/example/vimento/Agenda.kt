package com.example.vimento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vimento.databinding.ActivityAgendaBinding
import com.example.vimento.databinding.ActivityMainBinding

class Agenda : AppCompatActivity() {
    private lateinit var binding: ActivityAgendaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgendaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button4.setOnClickListener() {
            startActivity(Intent(this, Agendar::class.java))
        }
    }
}