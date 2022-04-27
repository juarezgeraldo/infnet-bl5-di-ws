package com.example.primeiraaplicacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnSalvar = this.findViewById<Button>(R.id.btnSalvar)

        btnSalvar.setOnClickListener {
            var txtNome = this.findViewById<EditText>(R.id.txtNome)
            var textoNome = txtNome.text.toString();
            var txtEmail = this.findViewById<EditText>(R.id.txtEmail)
            var textoEmail = txtEmail.text.toString();

            Toast.makeText(this, "Bem vindo ${textoNome} e seu e-mail é: ${textoEmail}",
                Toast.LENGTH_LONG).show()
        }
    }
}