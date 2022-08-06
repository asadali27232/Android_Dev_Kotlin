package com.example.myapptracker.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapptracker.R
import com.example.myapptracker.model.AppCard
import java.net.URI

class AppCardAdapter(private val appCards: List<AppCard>, val context: Context) : RecyclerView.Adapter<AppCardAdapter.AppCardViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppCardViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout_main, parent, false)
        return AppCardViewHolder(view)
    }

    override fun onBindViewHolder(holder: AppCardViewHolder, position: Int) {
        val context = holder.itemView.context

        holder.appTitle.text = appCards[position].appTitle
        holder.appIcon.setImageResource(appCards[position].appIcon)
        holder.appDescription.text = appCards[position].appDescription

        holder.iconGithub.setOnClickListener {
            val githubUrl: Uri = Uri.parse(appCards[position].githubUrl)
            val intent = Intent(Intent.ACTION_VIEW, githubUrl)
            context.startActivity(intent)
        }

        holder.iconDownload.setOnClickListener {
            val downloadUrl: Uri = Uri.parse(appCards[position].downlaodUrl)
            val intent = Intent(Intent.ACTION_VIEW, downloadUrl)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return appCards.size
    }

    class AppCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val appTitle: TextView = itemView.findViewById<TextView>(R.id.title)
        val appIcon: ImageView = itemView.findViewById(R.id.icon)
        val appDescription: TextView = itemView.findViewById<TextView>(R.id.description)
        val iconGithub: ImageView = itemView.findViewById(R.id.ic_github)
        val iconDownload: ImageView = itemView.findViewById(R.id.ic_download)
        val iconImage: ImageView = itemView.findViewById(R.id.ic_image)
    }
}
