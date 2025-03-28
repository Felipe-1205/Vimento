package com.example.vimento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vimento.databinding.ActivityAgendarBinding
import com.example.vimento.databinding.ActivityMainBinding

class Agendar : AppCompatActivity() {
    private lateinit var binding: ActivityAgendarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgendarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button4.setOnClickListener() {
            startActivity(Intent(this, MenuPrincipal::class.java))
        }
    }
}