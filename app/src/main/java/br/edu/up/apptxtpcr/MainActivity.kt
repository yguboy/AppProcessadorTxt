package br.edu.up.apptxtpcr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

//View.OnClickListener
class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var txt01: EditText
    lateinit var txt02: EditText
    lateinit var btnProcessar: Button
    lateinit var txtConsole: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt01 = findViewById(R.id.txt01)
        txt02 = findViewById(R.id.txt02)
        btnProcessar = findViewById(R.id.btnProcessar)
        txtConsole = findViewById(R.id.txtConsole)

        btnProcessar.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var textoCompleto = txt01.text.toString() + txt02.text.toString()
        txtConsole.text = textoCompleto
    }
}