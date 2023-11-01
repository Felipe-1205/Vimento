package com.example.vimento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vimento.databinding.ActivityMainBinding
import com.example.vimento.databinding.ActivityRegistrarFamiliarBinding

class RegistrarFamiliar : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrarFamiliarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrarFamiliarBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}