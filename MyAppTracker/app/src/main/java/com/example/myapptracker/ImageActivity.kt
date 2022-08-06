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
                "happy_birthday" -> setImageResource(R.drawable.happy_birthday_icon)
                "my_dice" -> setImageResource(R.drawable.my_dice_icon)
                "base_converter" -> setImageResource(R.drawable.base_converter_icon)
                "tip_time" -> setImageResource(R.drawable.tip_time_icon)
                "affirmations" -> setImageResource(R.drawable.tip_time_icon)
                "contacts" -> setImageResource(R.drawable.contacts_icon)
                "songs_list" -> setImageResource(R.drawable.songs_list_icon)
                "unit_converter" -> setImageResource(R.drawable.unit_converter_icon)
                "words" -> setImageResource(R.drawable.words_icon)
            }
        }

    }
}