package com.example.assignment_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Module4NewTasks : AppCompatActivity() {
    lateinit var txtFont:TextView
    lateinit var btnPlus: Button
    lateinit var btnMinus:Button

    var ourFontSize =  14f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module4_new_tasks)

        txtFont = findViewById(R.id.txtFontSize)
        btnPlus = findViewById(R.id.btnP)
        btnMinus = findViewById(R.id.btnM)

        txtFont.setTextSize(ourFontSize)

        btnPlus.setOnClickListener {

            ourFontSize += 4f
            txtFont.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontSize)

            Toast.makeText(applicationContext, ""+txtFont.textSize, Toast.LENGTH_SHORT).show()
       }

        btnMinus.setOnClickListener {

            ourFontSize -= 4f
            txtFont.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontSize)

            Toast.makeText(applicationContext, ""+txtFont.textSize, Toast.LENGTH_SHORT).show()

        }
    }
}