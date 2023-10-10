package com.example.assignment_4

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.persistableBundleOf
import java.util.Arrays


class ListViewString : AppCompatActivity() {
    //lateinit var listV :MutableList<String>

    lateinit var listV : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_string)

        listV = findViewById(R.id.ListViewPerson1)

        var arr = resources.getStringArray(R.array.person)
        var adapter = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1,arr)
         listV.adapter = adapter
   }

}



