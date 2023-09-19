package com.example.staggered

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(private val itemlist:List<Int>) :RecyclerView.Adapter<ImageAdapter.Viewholder>() {
    class Viewholder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val imageview:ImageView=itemView.findViewById(R.id.imageview)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.each_item,null)
        return Viewholder(view)
    }

    override fun getItemCount(): Int {
       return itemlist.size
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.imageview.setImageResource(itemlist[position])
    }
}