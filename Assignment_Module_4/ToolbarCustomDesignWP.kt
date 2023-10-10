package com.example.assignment_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.Toolbar

class ToolbarCustomDesignWP : AppCompatActivity() {
    lateinit var  toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar_custom_design_wp)

        toolbar = findViewById(R.id.tool)
        setSupportActionBar(toolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        toolbar.inflateMenu(R.menu.options_menu)

        return super.onCreateOptionsMenu(menu)
    }
}