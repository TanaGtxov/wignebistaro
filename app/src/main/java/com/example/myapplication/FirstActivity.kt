package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.example.myapplication.fragments.fragmentAuthorization

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val fragmentAuthorization = fragmentAuthorization()

        val fm: FragmentManager = supportFragmentManager

        fm.beginTransaction().add(R.id.layoutMain, fragmentAuthorization).commit()
    }
}