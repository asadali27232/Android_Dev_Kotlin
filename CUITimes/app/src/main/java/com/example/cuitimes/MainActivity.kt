package com.example.cuitimes

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cuitimes.adapter.TimetableAdapter
import com.example.cuitimes.data.Timetable
import com.example.cuitimes.data.TimetableList
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mondayTimetable = TimetableList().mondayTimetable()
        val tuesdayTimetable = TimetableList().tuesdayTimetable()
        val wednesdayTimetable = TimetableList().wednesdayTimetable()
        val thursdayTimetable = TimetableList().thursdayTimetable()
        val fridayTimetable = TimetableList().fridayTimetable()
        val emptyTimetable = TimetableList().emptyTimetable()

        when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK).toString()) {
            "1" -> setTimetable(emptyTimetable, "Today")
            "2" -> setTimetable(mondayTimetable, "Today")
            "3" -> setTimetable(tuesdayTimetable, "Today")
            "4" -> setTimetable(wednesdayTimetable, "Today")
            "5" -> setTimetable(thursdayTimetable, "Today")
            "6" -> setTimetable(fridayTimetable, "Today")
            "7" -> setTimetable(emptyTimetable, "Today")
        }

        findViewById<ImageView>(R.id.today_timetable_btn).setOnClickListener {
            when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
                1 -> setTimetable(emptyTimetable, "Today")
                2 -> setTimetable(mondayTimetable, "Today")
                3 -> setTimetable(tuesdayTimetable, "Today")
                4 -> setTimetable(wednesdayTimetable, "Today")
                5 -> setTimetable(thursdayTimetable, "Today")
                6 -> setTimetable(fridayTimetable, "Today")
                7 -> setTimetable(emptyTimetable, "Today")
            }
        }
        findViewById<Button>(R.id.m).setOnClickListener {
            setTimetable(mondayTimetable, "Monday")
        }
        findViewById<Button>(R.id.t).setOnClickListener {
            setTimetable(tuesdayTimetable, "Tuesday")
        }
        findViewById<Button>(R.id.w).setOnClickListener {
            setTimetable(wednesdayTimetable, "Wednesday")
        }
        findViewById<Button>(R.id.th).setOnClickListener {
            setTimetable(thursdayTimetable, "Thursday")
        }
        findViewById<Button>(R.id.f).setOnClickListener {
            setTimetable(fridayTimetable, "Friday")
        }
    }

    @SuppressLint("CutPasteId")
    private fun setTimetable(currentTimetable: List<Timetable>, currentDay: String) {
        findViewById<RecyclerView>(R.id.timetable_recycler).adapter = TimetableAdapter(currentTimetable)
        findViewById<RecyclerView>(R.id.timetable_recycler).layoutManager = LinearLayoutManager(this)
        findViewById<TextView>(R.id.time).text = "Your $currentDay's Timetable"
    }
}