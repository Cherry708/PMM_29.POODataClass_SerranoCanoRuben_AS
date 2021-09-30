package com.example.pmm_29poodataclass_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_29poodataclass_serranocanoruben_as.databinding.ActivityProblemaPropuesto1Binding

class ProblemaPropuesto1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema_propuesto1)

        val binding = ActivityProblemaPropuesto1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnter30.setOnClickListener {
            val dado = Dado(5)
            binding.tvResultado30.text = dado.toString()
        }

    }
}
data class Dado(val valor:Int){
    override fun toString(): String {
        val espaciador = "*"
        return "Dado: ${espaciador.repeat(this.valor)}"
    }
}