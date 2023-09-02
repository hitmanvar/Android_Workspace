package com.example.assignment_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ReceiveData : AppCompatActivity() {
    lateinit var txtData : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive_data)

        txtData = findViewById(R.id.txtRec)


        var txtR = intent.getStringExtra("key1")
        txtData.setText(txtR)
    }
}