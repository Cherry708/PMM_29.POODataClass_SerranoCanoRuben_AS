package com.example.pmm_29poodataclass_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_29poodataclass_serranocanoruben_as.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnter10.setOnClickListener {
            val codigo = binding.etCodigo10.text.toString().toInt()
            val descripcion = binding.etDescripcion10.text.toString()
            val precio = binding.etPrecio10.text.toString().toDouble()
            val articulo = Articulo(codigo,descripcion,precio)
            binding.tvResultado10.text = articulo.toString()
        }


    }
}

data class Articulo(val codigo:Int, val descripcion:String, var precio:Double){}