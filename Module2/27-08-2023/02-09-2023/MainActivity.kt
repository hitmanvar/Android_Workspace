package com.example.assignment_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var t1 :TextView


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        t1=findViewById(R.id.txt1)

        Handler().postDelayed(Runnable {

            var i = Intent(applicationContext,colorChanger::class.java)
            startActivity(i)
        },2000)


    }
}