package com.example.assignment_demo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class BlankFragment : Fragment() {

    lateinit var txt1 : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         var view = inflater.inflate(R.layout.fragment_blank, container, false)

        txt1 = view.findViewById(R.id.txtFragment)

        txt1.setOnClickListener {

            startActivity(Intent(requireActivity(),LoginPage::class.java))
        }

        return view
    }

}