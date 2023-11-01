package com.example.vimento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vimento.databinding.ActivityIngresarNotaBinding
import com.example.vimento.databinding.ActivityMainBinding

class IngresarNota : AppCompatActivity() {
    private lateinit var binding: ActivityIngresarNotaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIngresarNotaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button4.setOnClickListener() {
            startActivity(Intent(this, MenuPrincipal::class.java))
        }
    }
}