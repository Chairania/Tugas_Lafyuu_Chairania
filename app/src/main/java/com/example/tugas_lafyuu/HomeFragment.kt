package com.example.tugas_lafyuu

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Initialize views
        val favoriteIcon: ImageView = view.findViewById(R.id.favoriteIcon)
        val imagesepatu: ImageView = view.findViewById(R.id.imageView1)
        val seeMore: TextView = view.findViewById(R.id.seeMore)

        // Set OnClickListener for favoriteIcon
        favoriteIcon.setOnClickListener {
            val intent = Intent(activity, Favorite::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for imagesepatu
        imagesepatu.setOnClickListener {
            val intent = Intent(activity, Buy::class.java)
            startActivity(intent)
        }

        // Handle See More click
        seeMore.setOnClickListener {
            val intent = Intent(requireContext(), MoreFlashSale::class.java)
            startActivity(intent)
        }

        return view
    }
}
