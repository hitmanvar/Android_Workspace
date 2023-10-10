package com.example.assignment_4

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.SeekBar
import android.widget.TextView

class SeekBarActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {

    lateinit var s1:SeekBar
    lateinit var s2:SeekBar
    lateinit var s3:SeekBar
    lateinit var t1:TextView
    lateinit var t2:TextView
    lateinit var t3:TextView

    lateinit var bg :LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)

        s1 = findViewById(R.id.seek1)
        s2 = findViewById(R.id.seek2)
        s3 = findViewById(R.id.seek3)
        t1 = findViewById(R.id.txt1)
        t2 = findViewById(R.id.txt2)
        t3 = findViewById(R.id.txt3)

        bg = findViewById(R.id.linearLayout1)

        s1!!.setOnSeekBarChangeListener(this)
        s2!!.setOnSeekBarChangeListener(this)
        s3!!.setOnSeekBarChangeListener(this)

    }

    override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

        var r = s1!!.progress
        var g = s2!!.progress
        var b = s3!!.progress

        bg.setBackgroundColor(Color.rgb(r,g,b))
    }

    override fun onStartTrackingTouch(p0: SeekBar?) {

    }

    override fun onStopTrackingTouch(p0: SeekBar?) {

    }
}