package com.example.myapplication.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.fragments.*

class mgzavriswerilebi_adapter(activity:FragmentActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
       return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> firstpage_mgzavriswerilebi()
            1 -> secondpage_mgzavriswerilebi()
            2 -> thirdpage_mgzavriswerilebi()
            3 -> fourthpage_mgzavriswerilebi()
            4 -> fifthpage_mgzavriswerilebi()
            else -> firstpage_mgzavriswerilebi()
        }
    }
}