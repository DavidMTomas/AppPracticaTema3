package com.davidmaiques.apppracticatema3

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.davidmaiques.apppracticatema3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.flbotonEnviar.setOnClickListener {
            val usuario = binding.txtfUsuario.text.toString()
            val direccion = binding.txtfDireccion.text.toString()

            val tiempo = when {
                binding.rbManyana.isChecked -> "Mañana"
                binding.rbTarde.isChecked -> "Tarde"
                binding.rbNoche.isChecked -> "Noche"
                else -> "Nada"
            }

            val hora = binding.spnHora.selectedItem.toString()
            val opcion1 = binding.cbOpcion1.isChecked
            val opcion2 = binding.cbOpcion2.isChecked
            val texto = binding.textoExtenso.text.toString()


            val intent = Intent(this, DatosActivity::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("direccion", direccion)
            intent.putExtra("tiempo", tiempo)
            intent.putExtra("hora", hora)
            intent.putExtra("opcion1", opcion1)
            intent.putExtra("opcion2", opcion2)
            intent.putExtra("texto", texto)
            startActivity(intent)
        }


    }
}