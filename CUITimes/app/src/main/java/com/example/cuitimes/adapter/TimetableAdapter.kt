package com.example.cuitimes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.cuitimes.R
import com.example.cuitimes.data.Timetable

class TimetableAdapter(private val timetableList: List<Timetable>) :
    RecyclerView.Adapter<TimetableAdapter.TimetableViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimetableViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.class_card_layout, parent, false)
        return TimetableViewHolder(view)
    }

    override fun onBindViewHolder(holder: TimetableViewHolder, position: Int) {
        holder.title.text = timetableList[position].title
        holder.classType.text = timetableList[position].classType
        holder.lecturerName.text = timetableList[position].lecturerName
        holder.lectureTime.text = timetableList[position].lectureTime
    }

    override fun getItemCount(): Int {
        return timetableList.size
    }

    class TimetableViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.findViewById<TextView>(R.id.course_title)
        var classType: TextView = itemView.findViewById<TextView>(R.id.class_type)
        var lecturerName: TextView = itemView.findViewById<TextView>(R.id.lecturer_name)
        var lectureTime: TextView = itemView.findViewById<TextView>(R.id.lecture_time)
        var card: CardView = itemView.findViewById(R.id.card)
    }
}