package com.example.vimento

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
    }
}