package com.likobehruz.mrbexruz_bio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class ContactFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_contact, container, false)

        val btninsta: Button = view.findViewById(R.id.btninsta)
        btninsta.setOnClickListener {
            val insta1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/likouzbgamer"))
            startActivity(insta1)
        }
        val btntele: Button = view.findViewById(R.id.btntele)
        btntele.setOnClickListener {
            val teleg1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/likogamer"))
            startActivity(teleg1)
        }
        return view
    }


}