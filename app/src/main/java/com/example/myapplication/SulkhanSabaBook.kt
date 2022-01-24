package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.adapters.sulkhansaba_adapter

class SulkhanSabaBook : AppCompatActivity() {
    lateinit var viewpager_sulkhansaba : ViewPager2
    lateinit var sulkhansaba_adapter : sulkhansaba_adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sulkhan_saba_book)
        viewpager_sulkhansaba = findViewById(R.id.viewpager_sulkhansaba)
        sulkhansaba_adapter = sulkhansaba_adapter(this)


        viewpager_sulkhansaba.adapter = sulkhansaba_adapter
    }
}