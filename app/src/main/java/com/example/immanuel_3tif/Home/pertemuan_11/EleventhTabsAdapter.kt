package com.example.immanuel_3tif.Home.pertemuan_11

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class EleventhTabsAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    // Jumlah total tab yang ada
    override fun getItemCount(): Int = 2

    // Menentukan Fragment mana yang ditampilkan berdasarkan posisi
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> TabAFragment()
            1 -> TabBFragment()
            else -> throw IllegalStateException("Posisi tidak valid")
        }
    }
}