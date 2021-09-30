package com.example.pmm_29poodataclass_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_29poodataclass_serranocanoruben_as.databinding.ActivityProblema2Binding

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)

        val binding = ActivityProblema2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnter20.setOnClickListener {
            val nombre = binding.etNombre20.text.toString()
            val edad = binding.etEdad20.text.toString().toInt()
            val persona = Persona(nombre,edad)
            binding.etResultado20.text = persona.toString()
        }


    }
}

data class Persona(var nombre:String, var edad:Int){
    override fun toString(): String {
        return "$nombre, $edad"
    }
}