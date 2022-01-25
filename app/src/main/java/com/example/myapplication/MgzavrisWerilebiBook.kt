package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.adapters.mgzavriswerilebi_adapter

class MgzavrisWerilebiBook : AppCompatActivity() {
    private lateinit var viewpager_mgzavriswerilebi: ViewPager2
    private lateinit var mgzavriswerilebi_adapter: mgzavriswerilebi_adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mgzavris_werilebi_book)


        viewpager_mgzavriswerilebi = findViewById(R.id.viewpager_mgzavriswerilebi)
        mgzavriswerilebi_adapter = mgzavriswerilebi_adapter(this)


        viewpager_mgzavriswerilebi.adapter = mgzavriswerilebi_adapter

    }
}