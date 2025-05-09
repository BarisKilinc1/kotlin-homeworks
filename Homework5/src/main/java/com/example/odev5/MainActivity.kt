package com.example.odev5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.odev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var baglama: ActivityMainBinding
    private var mevcutGirdi = ""
    private var toplam = 0
    private var ifade = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        baglama = ActivityMainBinding.inflate(layoutInflater)
        setContentView(baglama.root)

        baglama.btn1.setOnClickListener { sayiEkle("1") }
        baglama.btn2.setOnClickListener { sayiEkle("2") }
        baglama.btn3.setOnClickListener { sayiEkle("3") }
        baglama.btn4.setOnClickListener { sayiEkle("4") }
        baglama.btn5.setOnClickListener { sayiEkle("5") }
        baglama.btn6.setOnClickListener { sayiEkle("6") }
        baglama.btn7.setOnClickListener { sayiEkle("7") }
        baglama.btn8.setOnClickListener { sayiEkle("8") }
        baglama.btn9.setOnClickListener { sayiEkle("9") }

        baglama.btnAdd.setOnClickListener { operatorEkle("+") }

        baglama.btnesittir.setOnClickListener {
            if (mevcutGirdi.isNotEmpty()) {
                toplam += mevcutGirdi.toInt()
            }
            baglama.resultText.text = toplam.toString()
            ifade = ""
            mevcutGirdi = ""
        }

        baglama.btnClear.setOnClickListener {
            mevcutGirdi = ""
            toplam = 0
            ifade = ""
            baglama.resultText.text = "0"
        }
    }

    private fun sayiEkle(sayi: String) {
        mevcutGirdi += sayi
        ifade += sayi
        baglama.resultText.text = ifade
    }

    private fun operatorEkle(operator: String) {
        if (mevcutGirdi.isNotEmpty()) {
            toplam += mevcutGirdi.toInt()
            ifade += operator
            baglama.resultText.text = ifade
            mevcutGirdi = ""
        }
    }
}
