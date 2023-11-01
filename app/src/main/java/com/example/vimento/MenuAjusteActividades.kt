package com.example.vimento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vimento.databinding.ActivityMainBinding
import com.example.vimento.databinding.ActivityMenuAjusteActividadesBinding

class MenuAjusteActividades : AppCompatActivity() {
    private lateinit var binding: ActivityMenuAjusteActividadesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuAjusteActividadesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}