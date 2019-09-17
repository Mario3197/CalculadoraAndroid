package com.e.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var botonC: Button
    lateinit var boton0: Button
    lateinit var boton1: Button
    lateinit var boton2: Button
    lateinit var boton3: Button
    lateinit var boton4: Button
    lateinit var boton5: Button
    lateinit var boton6: Button
    lateinit var boton7: Button
    lateinit var boton8: Button
    lateinit var boton9: Button
    lateinit var botonMas: Button
    lateinit var botonMenos: Button
    lateinit var botonMultiplicar: Button
    lateinit var botonDividir: Button
    lateinit var botonBorrar: Button
    lateinit var botonPunto: Button
    lateinit var operacion: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        operacion = findViewById(R.id.operacion)
        botonC = findViewById(R.id.clear)
        boton0 = findViewById(R.id.cero)
        boton1 = findViewById(R.id.uno)
        boton2 = findViewById(R.id.dos)
        boton3 = findViewById(R.id.tres)
        boton4 = findViewById(R.id.cuatro)
        boton5 = findViewById(R.id.cinco)
        boton6 = findViewById(R.id.seis)
        boton7 = findViewById(R.id.siete)
        boton8 = findViewById(R.id.ocho)
        boton9 = findViewById(R.id.nueve)
        botonMas = findViewById(R.id.mas)
        botonMenos = findViewById(R.id.menos)
        botonMultiplicar = findViewById(R.id.multiplicar)
        botonDividir = findViewById(R.id.dividir)
        botonBorrar = findViewById(R.id.borrar)
        botonPunto = findViewById(R.id.punto)
        botonC.setOnClickListener{ operacion.text = "" }
        boton0.setOnClickListener{ agregarElementoOperacion("0")}
        boton1.setOnClickListener{ agregarElementoOperacion("1")}
        boton2.setOnClickListener{ agregarElementoOperacion("2")}
        boton3.setOnClickListener{ agregarElementoOperacion("3")}
        boton4.setOnClickListener{ agregarElementoOperacion("4")}
        boton5.setOnClickListener{ agregarElementoOperacion("5")}
        boton6.setOnClickListener{ agregarElementoOperacion("6")}
        boton7.setOnClickListener{ agregarElementoOperacion("7")}
        boton8.setOnClickListener{ agregarElementoOperacion("8")}
        boton9.setOnClickListener{ agregarElementoOperacion("9")}
        botonMas.setOnClickListener{ agregarElementoOperacion("+")}
        botonMenos.setOnClickListener{ agregarElementoOperacion("-")}
        botonDividir.setOnClickListener{ agregarElementoOperacion("/")}
        botonMultiplicar.setOnClickListener{ agregarElementoOperacion("*")}
        botonPunto.setOnClickListener{ agregarElementoOperacion(".")}
        botonBorrar.setOnClickListener{
            var string = operacion.text.toString()
            if (string.length > 0) {
                operacion.text = string.subSequence(0, string.length - 1)
            }
        }
    }
    
    fun agregarElementoOperacion(elemento: String) {
        val operacionString = operacion.text.toString()
        if (operacionString.length == 12) {
            Toast.makeText(this,"Límite de números alcanzado", Toast.LENGTH_SHORT).show()
        } else {
            operacion.text = operacionString + elemento
        }
    }
}
