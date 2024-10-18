package com.example.task201

import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class ImagePagerAdapter(private val imageSlider: List<Int>) : RecyclerView.Adapter<ImagePagerAdapter.ViewHolder>() {
    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){

        val imageView:ImageView = itemView.findViewById(R.id.viewPagerImage)


    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ImagePagerAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewpager_item, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ImagePagerAdapter.ViewHolder, position: Int) {
        val imageResId = imageSlider[position]
        holder.imageView.setImageResource(imageResId)
    }

    override fun getItemCount(): Int {
        return imageSlider.size

    }

}
