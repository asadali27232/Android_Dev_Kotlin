package com.example.myapptracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        val appName = intent?.extras?.getString("APP_NAME").toString()

        with(findViewById<ImageView>(R.id.app_image)) {
            when (appName) {
                "happy_birthday" -> setImageResource(R.drawable.happy_birthday)
                "my_dice" -> setImageResource(R.drawable.my_dice)
                "base_converter" -> setImageResource(R.drawable.base_converter)
                "tip_time" -> setImageResource(R.drawable.tip_time)
                "affirmations" -> setImageResource(R.drawable.affirmations)
                "contacts" -> setImageResource(R.drawable.contacts)
                "songs_list" -> setImageResource(R.drawable.songs_list)
                "unit_converter" -> setImageResource(R.drawable.unit_converter)
                "words" -> setImageResource(R.drawable.words)
            }
        }

    }
}