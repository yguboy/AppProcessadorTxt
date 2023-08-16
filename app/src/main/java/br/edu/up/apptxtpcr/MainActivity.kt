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

    fun subtrair(a: Int, b: Int): Int{
        return a - b
    }

    fun somar(a: Int, b: Int): Int{
        return a + b
    }

    fun dividir(a: Int, b: Int): Int{
        return a / b
    }

    fun multiplicar(a: Int, b: Int): Int{
        return a * b
    }

    override fun onClick(p0: View?) {
        //var textoCompleto = txt01.text.toString() + txt02.text.toString()
        var a = txt01.text.toString()
        var b = txt02.text.toString()

        //var texto = ""
        for(contador in 1..a.toInt()){
            //texto += contador.toString() + "\n"
            //texto += "Número: " + contador.toString() + "\n"
            //texto += "Número: $contador \n"
        }

        //var texto = ""
        //if (a.toInt() < 10){
        //    texto = "Valor de A é menor que 10!"
        //} else {
        //    texto = "Valor de A é maior que 10!"
        //}

        //var resultado: Int = somar(a.toInt(), b.toInt())

    val litaDeFrutas = mutableListOf("Laranja", "Maça", "Pêssego")
        listaDeFrutas[10] = "Mexirica"
        listaDeFrutas.removeAt(2)
        var texto = ""
        for(fruta in listaDeFrutas){
            texto += fruta + "\n"
        }
        txtConsole.text = texto //resultado.toString() //textoCompleto
    }
}