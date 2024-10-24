package com.likobehruz.mrbexruz_bio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.likobehruz.mrbexruz_bio.databinding.FragmentHomeBinding
import com.likobehruz.mrbexruz_bio.databinding.FragmentProjectBinding

class HomeFragment : Fragment() {
lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentHomeBinding.inflate(layoutInflater)

        binding.btnMemories.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.main, HotiralarFragment())
                .addToBackStack("K")
                .commit()
        }

        binding.btnProjects.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.main, ProjectFragment())
                .addToBackStack("K1")
                .commit()
        }
        binding.btnContact.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.main, ContactFragment())
                .addToBackStack("Kw")
                .commit()
        }

        return binding.root
    }


}