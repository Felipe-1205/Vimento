package com.example.vimento

import android.content.Intent
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

        binding.modousuario.setOnClickListener() {
            startActivity(Intent(this, MenuPaciente::class.java))
        }
        binding.familiar.setOnClickListener() {
            startActivity(Intent(this, ListaFamiliares::class.java))
        }
        binding.ajusteusuario.setOnClickListener() {
            startActivity(Intent(this, CambiarInfoPaciente::class.java))
        }
        binding.nota.setOnClickListener() {
            startActivity(Intent(this, IngresarNota::class.java))
        }
        binding.agenda.setOnClickListener() {
            startActivity(Intent(this, Agenda::class.java))
        }
        binding.ajusteactividad.setOnClickListener() {
            startActivity(Intent(this, MenuAjusteActividades::class.java))
        }
    }
}