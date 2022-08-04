package com.example.examplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val songs = listOf<Songs>(
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
            Songs("Koi Mil Gaya" , "Koi Mil Gaya"),
        )

        findViewById<RecyclerView>(R.id.songList).adapter = MyAdapter(songs)
        findViewById<RecyclerView>(R.id.songList).layoutManager = GridLayoutManager(this, 2)
    }
}