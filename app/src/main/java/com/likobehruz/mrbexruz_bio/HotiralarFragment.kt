package com.likobehruz.mrbexruz_bio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.likobehruz.mrbexruz_bio.adapters.ImageAdapter

class HotiralarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_hotiralar, container, false)

        val recyclerView: RecyclerView = view.findViewById(R.id.rv)
        recyclerView.layoutManager = GridLayoutManager(context, 2)

        val imageList = listOf(
            R.drawable.img_5,R.drawable.img_10,
            R.drawable.img_1, R.drawable.img_6,
            R.drawable.img_2, R.drawable.img_7,
            R.drawable.img_3, R.drawable.img_8,
            R.drawable.img_4, R.drawable.img_19,
            R.drawable.img_15, R.drawable.img_9,
            R.drawable.img_11, R.drawable.img_16,
            R.drawable.img_12, R.drawable.img_17,
            R.drawable.img_13, R.drawable.img_18,
            R.drawable.img_14, R.drawable.img_20

        )

        recyclerView.adapter = ImageAdapter(imageList)

        return view

    }


}