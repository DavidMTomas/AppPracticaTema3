package com.davidmaiques.apppracticatema3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.davidmaiques.apppracticatema3.databinding.ActivityDatosBinding
import com.davidmaiques.apppracticatema3.databinding.ActivityMainBinding

class DatosActivity : AppCompatActivity() {
    lateinit var binding:ActivityDatosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_datos)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding=ActivityDatosBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val  usuario=intent.getStringExtra("usuario")?:"Usuario no disponible"
        binding.usuario.text=usuario

        val direccion=intent.getStringExtra("direccion")?:"Datos no disponibles"
        binding.direccion.text=direccion

        val tiempo=intent.getStringExtra("tiempo")?:"Tiempo no odisponible"
        binding.tiempo.text=tiempo

        val hora=intent.getStringExtra("hora")?:"Hora no disponible"
        binding.hora.text=hora

        val opcion1=intent.getStringExtra("opcion1")?:"Opcion 1 no disponible"
        binding.opcion1.text=opcion1

        val opcion2=intent.getStringExtra("opcion2")?:"Opcion 2 no disponible"
        binding.opcion2.text=opcion2

        val texto=intent.getStringExtra("texto")?:"Texto no disponible"
        binding.texto.text=texto

    }
}