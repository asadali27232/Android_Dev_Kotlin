package com.example.contactsrecyclerview.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.contactsrecyclerview.R
import com.example.contactsrecyclerview.data.Contact
import com.example.contactsrecyclerview.util.ColorPicker

class ContactAdapter(private val contacts: List<Contact>): RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.contact_view, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.name.text = contacts[position].name
        holder.number.text = contacts[position].number
        holder.email.text = contacts[position].email
        holder.card.setCardBackgroundColor(Color.parseColor(ColorPicker.getCardColor()))
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById<TextView>(R.id.name)
        var number: TextView = itemView.findViewById<TextView>(R.id.number)
        var email: TextView = itemView.findViewById<TextView>(R.id.emailAddress)
        var card: CardView = itemView.findViewById<CardView>(R.id.contactCard)
    }
}