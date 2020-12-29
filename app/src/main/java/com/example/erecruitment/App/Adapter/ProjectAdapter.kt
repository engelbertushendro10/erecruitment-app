package com.example.erecruitment.App.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.erecruitment.R

@Suppress("DEPRECATION")
class ProjectAdapter() : RecyclerView.Adapter<ProjectAdapter.ViewHolder>(){
    private var title = arrayOf("Android Project",
                                "Web Project",
                                "Project Android Bali",
                                "android studio",
                                "web socket",
                                "android arkademy",
                                "web Project",
                                "Project Pribadi 1",
                                "project Arkademy")
    private var detail = arrayOf("Aplikasi Pemesanan Makanan Online",
                                    "Aplikasi Website Pemerintah Bali",
                                    "Aplikasi Android Pemda Bali",
                                    "Android App",
                                    "Aplikasi Pemesanan Makanan Online",
                                    "Aplikasi Pemesanan Makanan Online",
                                    "Aplikasi Pemesanan Makanan Online",
                                    "Aplikasi Pemesanan Makanan Online",
                                    "Aplikasi Pemesanan Makanan Online",
                                )
    private val image = intArrayOf(
        R.drawable.intelij,
        R.drawable.intelij,
        R.drawable.intelij,
        R.drawable.intelij,
        R.drawable.intelij,
        R.drawable.intelij,
        R.drawable.intelij,
        R.drawable.intelij,
        R.drawable.intelij,
        )
    override fun onCreateViewHolder(parent: ViewGroup , viewType: Int): ProjectAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.project_card,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ProjectAdapter.ViewHolder , position: Int) {
        holder.itemTitle.text = title[position].toString()
        holder.itemDetail.text = detail[position]
        holder.itemImage.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
        return title.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView = itemView.findViewById(R.id.item_image)
        var itemTitle: TextView = itemView.findViewById(R.id.item_title)
        var itemDetail: TextView = itemView.findViewById(R.id.item_detail)
        init {
            itemView.setOnClickListener{
                val position:Int = adapterPosition
                Toast.makeText(itemView.context,"you Click on ${title[position]}",Toast.LENGTH_LONG).show()
            }
        }
    }
}
























