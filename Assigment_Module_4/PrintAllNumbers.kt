package com.example.assignment_4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class PrintAllNumbers : AppCompatActivity() {

    lateinit var TxtResult : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_all_numbers)

        TxtResult = findViewById(R.id.txtResult)

        var i = intent
        var data = i.getStringExtra("num")
        TxtResult.setText(data)
    }
}