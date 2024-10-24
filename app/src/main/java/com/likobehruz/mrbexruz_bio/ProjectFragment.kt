package com.likobehruz.mrbexruz_bio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class ProjectFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_project, container, false)

        val btnmathgame:Button= view.findViewById(R.id.btn_math_game)
        val btntasbeh: Button = view.findViewById(R.id.btn_tasbeh)
        val btnpiano:Button=view.findViewById(R.id.btn_piano)

        btnmathgame.setOnClickListener {
            val telegramIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/androidBexruz/23"))
            startActivity(telegramIntent)
        }

        btnpiano.setOnClickListener {
            val telegramIntent2 = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/androidBexruz/58"))
            startActivity(telegramIntent2)
        }

        btntasbeh.setOnClickListener {
            val telegramIntent3 = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/androidBexruz/72"))
           startActivity(telegramIntent3)
                       }
        return view
    }
}