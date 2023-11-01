package com.example.vimento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vimento.databinding.ActivityListaFamiliaresBinding
import com.example.vimento.databinding.ActivityMainBinding

class ListaFamiliares : AppCompatActivity() {
    private lateinit var binding: ActivityListaFamiliaresBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListaFamiliaresBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}