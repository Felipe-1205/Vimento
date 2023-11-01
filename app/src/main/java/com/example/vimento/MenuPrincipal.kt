package com.example.vimento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vimento.databinding.ActivityMainBinding
import com.example.vimento.databinding.ActivityMenuPrincipalBinding

class MenuPrincipal : AppCompatActivity() {
    private lateinit var binding: ActivityMenuPrincipalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}