package com.example.assignment_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ChangeScreen : AppCompatActivity() {

    lateinit var edt1 : EditText
    lateinit var btnPass : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_screen)

        edt1 = findViewById(R.id.edt1)
        btnPass = findViewById(R.id.btnPass)


        btnPass.setOnClickListener {

            var msg = edt1.text.toString()

            var i = Intent(applicationContext,ReceiveData::class.java)

            i.putExtra("key1",msg)
            startActivity(i)

        }
    }
}