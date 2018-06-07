package com.example.plasma.tehdevauas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_masuk.setOnClickListener {
            if (nim.text.isEmpty()) nim.setError("NIM ga boleh kosong ya!")
            else if (nama.text.isEmpty()) nama.setError("Nama ga boleh kosong ya!")
            else {
                startActivity(Intent(this, SecondActivity::class.java))
            }
        }
    }
}
