package com.example.examplerecyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examplerecyclerview.adapter.MyAdapter
import com.example.examplerecyclerview.data.Song
import com.example.examplerecyclerview.data.SongsList

class MainActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val songs = SongsList().prepare()

        findViewById<RecyclerView>(R.id.songList).adapter = MyAdapter(songs)
        findViewById<RecyclerView>(R.id.songList).layoutManager = GridLayoutManager(this, 1)
    }
}