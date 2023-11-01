package com.example.vimento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vimento.databinding.ActivityLoginFamiliarBinding
import com.example.vimento.databinding.ActivityMainBinding

class LoginFamiliar : AppCompatActivity() {
    private lateinit var binding: ActivityLoginFamiliarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginFamiliarBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}