package com.example.plasma.tehdevauas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import kotlin.math.pow
import kotlin.math.sqrt

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        hitung.setOnClickListener {
            if (tinggi.text.isEmpty()) tinggi.setError("Tinggi tidak boleh kosong ya guys!")
            else if (alas.text.isEmpty()) alas.setError("Alas juga gak boleh kosong!")
            else {
                var t: Float = tinggi.text.toString().toFloat()
                var a: Float = alas.text.toString().toFloat()
                var m = sqrt(t.pow(2) + a.pow(2))
                hasil.setText("" + m)
            }
        }

        reset.setOnClickListener {
            tinggi.setText("")
            alas.setText("")
            hasil.setText("0")
            tinggi.requestFocus()
        }
    }
}
