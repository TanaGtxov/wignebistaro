package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DochanashviliPage : AppCompatActivity() {
    lateinit var dochanashvili_toread : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dochanashvili_page)

        dochanashvili_toread = findViewById(R.id.dochanashvili_toread)

        dochanashvili_toread.setOnClickListener(){
            var mintent = Intent(this, DochanashviliBook::class.java)
            startActivity(mintent)
        }
    }
}