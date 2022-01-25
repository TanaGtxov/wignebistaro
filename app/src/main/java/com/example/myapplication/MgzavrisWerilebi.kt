package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MgzavrisWerilebi : AppCompatActivity() {
    lateinit var mgzavriswerilebi_toread: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mgzavriswerilebi_page)

        mgzavriswerilebi_toread = findViewById(R.id.mgzavriswerilebi_toread)



        mgzavriswerilebi_toread.setOnClickListener() {

            var mintent = Intent(this, MgzavrisWerilebiBook::class.java)
            startActivity(mintent)

        }
    }
}