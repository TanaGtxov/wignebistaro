package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SulkhanSabaPage : AppCompatActivity() {
    lateinit var sulkhansaba_toread : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sulkhansaba_page)

        sulkhansaba_toread = findViewById(R.id.sulkhansaba_toread)


        sulkhansaba_toread.setOnClickListener(){

            var qintent = Intent(this, SulkhanSabaBook::class.java)
            startActivity(qintent)
        }
    }
}