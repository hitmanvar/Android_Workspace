package com.example.assignment_4

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.RelativeLayout

class RadioButtonBgColor : AppCompatActivity(), RadioGroup.OnCheckedChangeListener,
    CompoundButton.OnCheckedChangeListener {

    lateinit var rg:RadioGroup
    lateinit var btnRed:RadioButton
    lateinit var btnGreen:RadioButton
    lateinit var btnBlue:RadioButton
    lateinit var btnPink:RadioButton
    lateinit var bg  : RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button_bg_color)

        rg = findViewById(R.id.rg1)
        btnRed = findViewById(R.id.bgRed)
        btnGreen = findViewById(R.id.bgGreen)
        btnBlue = findViewById(R.id.bgBlue)
        btnPink = findViewById(R.id.bgPink)
        bg = findViewById(R.id.layoutBG1)

        rg.setOnCheckedChangeListener(this)
        btnRed.setOnCheckedChangeListener(this)
        btnGreen.setOnCheckedChangeListener(this)
        btnBlue.setOnCheckedChangeListener(this)
        btnPink.setOnCheckedChangeListener(this)
    }

    override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {

        if (btnRed.isChecked){

            bg.setBackgroundColor(Color.RED)
        }
        if (btnGreen.isChecked){

            bg.setBackgroundColor(Color.GREEN)
        }
        if (btnBlue.isChecked){

            bg.setBackgroundColor(Color.BLUE)
        }
        if (btnPink.isChecked){

            bg.setBackgroundColor(Color.MAGENTA)
        }
    }

    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {

    }
}