package com.example.geografiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.geografiapp.DepartamentosActivity

class MainActivity : AppCompatActivity() {

    lateinit var btnSalta: Button
    lateinit var btnJujuy: Button
    lateinit var btnSanLuis: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var departamentosSalta: ArrayList<String> = arrayListOf("San Martín", "Rivadavia", "Salta", "Oran", "La vinia", "Metan")
        //var departamentosJujuy: ArrayList<String> = arrayListOf("San Antonio", "San Pedro", "Santa Bárbara", "Cochinoca", "Humahuaca", "Tilcara")
        //var departamentosSanLuis: ArrayList<String> = arrayListOf("Coronel Pringles", "Chacabuco", "General San Martin", "Belgrano", "Junín", "Ayacucho")

        btnSalta = findViewById(R.id.botonSalta)
        //btnJujuy = findViewById(R.id.botonJujuy)
        //btnSanLuis = findViewById(R.id.botonSanLuis)
        btnSalta.setOnClickListener {

           val departamentos = departamentosSalta.joinToString(", ")

            val intentDepartamento = Intent(this, DepartamentosActivity::class.java)
            intentDepartamento.putExtra("departamentos", departamentos)

            startActivity(intentDepartamento)

            finish()
        }
    }

}