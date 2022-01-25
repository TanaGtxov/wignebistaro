package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.adapters.dochanashvili_adapter
import com.example.myapplication.adapters.mgzavriswerilebi_adapter

class DochanashviliBook : AppCompatActivity() {
    private lateinit var viewpager_dochanashvili: ViewPager2
    private lateinit var dochanashvili_adapter: dochanashvili_adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dochanashvili_book)

        viewpager_dochanashvili = findViewById(R.id.viewpager_dochanashvili)
        dochanashvili_adapter = dochanashvili_adapter(this)

        viewpager_dochanashvili.adapter = dochanashvili_adapter
    }
}