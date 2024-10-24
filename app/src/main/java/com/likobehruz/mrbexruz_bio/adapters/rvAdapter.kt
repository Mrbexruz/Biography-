package com.likobehruz.mrbexruz_bio.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.likobehruz.mrbexruz_bio.R


class ImageAdapter(private val imageList: List<Int>) :
        RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

        class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val imageView: ImageView = itemView.findViewById(R.id.image_view)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_rv, parent, false)
            return ImageViewHolder(view)
        }

        override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
            holder.imageView.setImageResource(imageList[position])
        }

        override fun getItemCount(): Int {
            return imageList.size
        }
    }