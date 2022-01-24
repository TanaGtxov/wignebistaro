package com.example.myapplication.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.fragments.firstpage_sulkhansaba
import com.example.myapplication.fragments.secondpage_sulkhansaba

class sulkhansaba_adapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){

            0 -> firstpage_sulkhansaba()
            1 -> secondpage_sulkhansaba()
            else -> firstpage_sulkhansaba()
        }
    }


}