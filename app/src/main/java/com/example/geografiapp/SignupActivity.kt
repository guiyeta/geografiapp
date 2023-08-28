package com.example.geografiapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignupActivity : AppCompatActivity() {

    // Variables para vincular con la vista
    lateinit var etUsuario: EditText
    lateinit var etCorreo: EditText
    lateinit var etPass: EditText
    lateinit var btnIniciar: Button
    lateinit var btnRegistrar: Button


    // Funcion que se ejecuta al iniciar un Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Vinculamos las variables con los IDs correspondientes a la vista
        etUsuario = findViewById(R.id.etUsuario)
        etPass = findViewById(R.id.etPass)
        etCorreo = findViewById(R.id.etCorreo)
        btnIniciar = findViewById(R.id.botonIniciar)
        btnRegistrar = findViewById(R.id.botonRegistrar)

        //Agregamos funcionalidad al Boton
        btnRegistrar.setOnClickListener {
            var mensaje = "Registrar Usuario"
            // Obtenemos el dato que se ingreso en la vista
            var usuario = etUsuario.text.toString()
            var correo = etCorreo.text.toString()
            var pass = etPass.text.toString()
            if(usuario.isEmpty() || correo.isEmpty() || pass.isEmpty()){
                mensaje+= " - Faltan Datos"
            }else {
                mensaje+= " - Datos OK"

                // Indicamos a que pantalla queremos ir
                val intentLogin = Intent(this, LoginActivity::class.java)
                // Agregamos datos que queremos pasar a la proxima pantalla
               // intentLogin.putExtra("nombre", usuario)
                // Cambiamos de pantalla
                startActivity(intentLogin)
                // Eliminamos la Activity actual para sacarla de la Pila
                finish()
            }
        }
        //Agregamos funcionalidad al Boton
        btnIniciar.setOnClickListener {
            val intentMain = Intent(this, MainActivity::class.java)
            // Cambiamos de pantalla
            startActivity(intentMain)
            // Eliminamos la Activity actual para sacarla de la Pila
            //finish()
            }

    }
}