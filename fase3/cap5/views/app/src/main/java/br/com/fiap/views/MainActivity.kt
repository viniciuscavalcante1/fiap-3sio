package br.com.fiap.views

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnClickAqui = findViewById<Button>(R.id.btn_nome)
        val txvNome = findViewById<TextView>(R.id.txv_nome)
        val edtNome = findViewById<EditText>(R.id.edt_nome)

        btnClickAqui.setOnClickListener {
            val nome: String = edtNome.editableText.toString()
            txvNome.text = nome
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun onClickAqui(view: View) {
        Toast.makeText(this, "Foi clicado!", Toast.LENGTH_SHORT).show()
    }
}