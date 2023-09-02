package com.example.assignment_demo

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout

class colorChanger : AppCompatActivity() {

    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button
    lateinit var bg : RelativeLayout
    lateinit var btn4 : Button
    lateinit var  btnLog : Button
    lateinit var  btnReg : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_changer)

        btn1 = findViewById(R.id.btnGreen)
        btn2 = findViewById(R.id.btnBlue)
        btn3 = findViewById(R.id.btnPink)
        bg = findViewById(R.id.Layout1)
        btn4 = findViewById(R.id.btnChngScr)
        btnLog = findViewById(R.id.btnLogin)
        btnReg = findViewById(R.id.btnReg)

        btn1.setOnClickListener {

            bg.setBackgroundColor(Color.GREEN)

        }

        btn2.setOnClickListener {

            bg.setBackgroundColor(Color.BLUE)

        }
        btn3.setOnClickListener {

            bg.setBackgroundColor(Color.MAGENTA)

        }

        btn4.setOnClickListener {

          var i = Intent(applicationContext, ChangeScreen::class.java)
            startActivity(i)

        }

        btnLog.setOnClickListener {
            var i =Intent(applicationContext,LoginPage::class.java)
            startActivity(i)
        }

        btnReg.setOnClickListener {
            var i =Intent(applicationContext,RegistrattionPage::class.java)
            startActivity(i)
        }

    }
}