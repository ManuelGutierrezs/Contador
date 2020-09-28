package mx.udg.cuvalles.Contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var contador = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        BtnIncrementar.setOnClickListener {
            contador++
            TxtContador.text = contador.toString()
        BtnDecrementar.setOnClickListener {
            contador--
            TxtContador.text = contador.toString()
        }
        }
    }
}