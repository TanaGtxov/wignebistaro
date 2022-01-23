package com.example.myapplication

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    lateinit var chavchavadzebtn_main: ImageButton
    lateinit var orbeliani_main: ImageButton
    lateinit var dochanashvili_main:Image
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var chavchavadzebtn_main = findViewById<ImageButton>(R.id.chavchavadzebtn_main)
        var orbeliani_main = findViewById<ImageButton>(R.id.orbeliani_main)
        var dochanashvili_main = findViewById<ImageButton>(R.id.dochanashvili_main)


        chavchavadzebtn_main.setOnClickListener() {
            var xintent = Intent(this, MgzavrisWerilebi::class.java)
            startActivity(xintent)

        }

        orbeliani_main.setOnClickListener() {
            var dintent = Intent(this, SulkhanSabaPage::class.java)
            startActivity(dintent)
        }
        dochanashvili_main.setOnClickListener() {
            var dintent = Intent(this, DochanashviliPage::class.java)
            startActivity(dintent)
        }

    }
}