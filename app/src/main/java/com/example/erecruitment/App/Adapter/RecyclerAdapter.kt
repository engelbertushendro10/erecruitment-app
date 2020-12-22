package com.example.erecruitment.App.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.erecruitment.App.Project.DetailProject
import com.example.erecruitment.R

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private val titile = arrayOf("d116df5",
        "36ffc75", "f5cfe78", "5b87628",
        "db8d14e", "9913dc4", "e120f96",
        "466251b")

    private val status = arrayOf("Kekayaan", "Teknologi",
        "Keluarga", "Bisnis",
        "Keluarga", "Hutang",
        "Teknologi", "Pidana")

    private val desc= arrayOf("pertanyaan 9",
        "pertanyaan 11", "pertanyaan 17", "test forum",
        "pertanyaan 12", "pertanyaan 18", "pertanyaan 20",
        "pertanyaan 21")

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemTitle: TextView = itemView.findViewById(R.id.title)
        var itemStatus: TextView = itemView.findViewById(R.id.Status)
        var itemDesc: TextView = itemView.findViewById(R.id.description)

        init {

            itemView.setOnClickListener {
                val position: Int = adapterPosition
                val context = itemView.context
                val intent = Intent(context, DetailProject::class.java).apply {
                    putExtra("NUMBER", position)
                    putExtra("CODE", itemTitle.text)
                    putExtra("CATEGORY", itemStatus.text)
                    putExtra("CONTENT", itemDesc.text)
                }
                context.startActivity(intent)
            }
        }
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.onprogres_card, viewGroup, false)
        return ViewHolder(v)
    }
    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = titile[i]
        viewHolder.itemStatus.text = status[i]
        viewHolder.itemDesc.text = desc[i]
    }
    override fun getItemCount(): Int {
        return titile.size
    }

}