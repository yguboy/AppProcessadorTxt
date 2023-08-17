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

    fun subtrair(a: Int, b: Int): Int {
        return a - b
    }

    fun somar(a: Int, b: Int): Int {
        return a + b
    }

    fun dividir(a: Int, b: Int): Int {
        return a / b
    }

    fun multiplicar(a: Int, b: Int): Int {
        return a * b
    }

    override fun onClick(p0: View?) {
        //var textoCompleto = txt01.text.toString() + txt02.text.toString()
        var a = txt01.text.toString()
        var b = txt02.text.toString()

        //var texto = ""
        //for(contador in 1..a.toInt()){
        //texto += contador.toString() + "\n"
        //texto += "Número: " + contador.toString() + "\n"
        //texto += "Número: $contador \n"
        //}

        //var texto = ""
        //if (a.toInt() < 10){
        //    texto = "Valor de A é menor que 10!"
        //} else {
        //    texto = "Valor de A é maior que 10!"
        //}

        //var resultado: Int = somar(a.toInt(), b.toInt())

        //    val litaDeFrutas = mutableListOf("Laranja", "Maçã", "Pêssego")
        //        listaDeFrutas[10] = "Mexirica"
        //        listaDeFrutas.removeAt(2)
        //        var texto = ""
        //        for(fruta in listaDeFrutas){
        //            texto += fruta + "\n"
        //        }


        //val lista = criarListaDeTexto(a.toInt(), b)
        //var texto = converterParaTextoConsole(lista)
        //txtConsole.text = texto //resultado.toString() textoCompleto
        // }

        val lista = criarListaDePessoas(a.toInt(), b)
        txtConsole.text = converterPessoasParaTextoConsole(lista)

        fun converterParaTextoConsole(lista: MutableList<String>): String {
            var texto = ""
            for (item in lista) {
                texto += item + "\n"
            }
            return texto
        }

        fun converterPessoasParaTextoConsole(lista: MutableList<Pessoa>): String {
            var texto = ""
            for(pessoa in lista){
                texto += "${pessoa.nome}, Idade: ${pessoa.idade} \n"
            }
            return texto
        }
    }


    fun criarListaDeTexto(total: Int, texto: String): MutableList<String> {
        var lista = mutableListOf<String>()
        for (contador in 1..total) {
            lista.add("$texto $contador")
        }
        return lista
    }

    //    class Pessoa {
    //        lateinit var nome: String
    //        fun calcular() {}
    //
    //    }

    class Pessoa(val nome: String, val idade: Int)
    fun criarListaDePessoas(total: Int, texto: String): MutableList<Pessoa> {
        var p1 = Pessoa( "Ygor",  19)
        var p2 = Pessoa( "Matheus",  20)

        //Quando ja se conhece os objetos
        //e se utiliza os objetos para criar a lista preenchida:
        //var lista = mutableListOf(p1, p2)

        //Quando ainda não se tem os obejetos
        //e vai adiciona-los posteriormente:
        var lista = mutableListOf<Pessoa>()
        //lista.add(p1)
        //lista.add(p2)
        for(contador in 1..total){
            //val pessoa = Pessoa("$texto $contador", contador)
            //lista.add(pessoa)
            lista.add(Pessoa("$texto $contador", contador))
        }
        return lista
    }
}