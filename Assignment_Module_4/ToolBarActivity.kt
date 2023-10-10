package com.example.assignment_4

import android.app.SearchManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import androidx.core.view.contains

class ToolBarActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener
    {
    lateinit var spin1: Spinner
    lateinit var toolbar: Toolbar
    lateinit var listV: ListView

    var spin = arrayOf("Animal", "Bird", "City", "Sports")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar)

        spin1 = findViewById(R.id.spinner1)
        toolbar = findViewById(R.id.tb1)
        setSupportActionBar(toolbar)
        listV = findViewById(R.id.list1)

        var adap =
            ArrayAdapter(applicationContext, android.R.layout.simple_spinner_dropdown_item, spin)
        spin1.adapter = adap
        spin1.setOnItemSelectedListener(this)

    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

        when (p2) {
            0 -> {
                var arr = resources.getStringArray(R.array.animal)
                var adapter = ArrayAdapter(
                    applicationContext,
                    android.R.layout.simple_spinner_dropdown_item,
                    arr
                )
                listV.adapter = adapter

            }

            1 -> {
                var arr = resources.getStringArray(R.array.bird)
                var adapter = ArrayAdapter(
                    applicationContext,
                    android.R.layout.simple_spinner_dropdown_item,
                    arr
                )
                listV.adapter = adapter
            }

            2 -> {
                var arr = resources.getStringArray(R.array.city)
                var adapter = ArrayAdapter(
                    applicationContext,
                    android.R.layout.simple_spinner_dropdown_item,
                    arr
                )
                listV.adapter = adapter
            }

            3 -> {
                var arr = resources.getStringArray(R.array.sports)
                var adapter = ArrayAdapter(
                    applicationContext,
                    android.R.layout.simple_spinner_dropdown_item,
                    arr
                )
                listV.adapter = adapter

            }
        }
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        toolbar.inflateMenu(R.menu.options_menu)

            return super.onCreateOptionsMenu(menu)
        }

    }




