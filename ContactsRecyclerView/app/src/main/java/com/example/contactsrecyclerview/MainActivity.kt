package com.example.contactsrecyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contactsrecyclerview.adapter.ContactAdapter
import com.example.contactsrecyclerview.data.Data

class MainActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contacts = Data().prepare()

        findViewById<RecyclerView>(R.id.contactsRecycler).adapter = ContactAdapter(contacts)
        findViewById<RecyclerView>(R.id.contactsRecycler).layoutManager = LinearLayoutManager(this)
    }
}