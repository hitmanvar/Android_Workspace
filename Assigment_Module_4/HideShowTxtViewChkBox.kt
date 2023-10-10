package com.example.assignment_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView

class HideShowTxtViewChkBox : AppCompatActivity() {

    lateinit var txtHS:TextView
    lateinit var chkHS:CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hide_show_txt_view_chk_box)

        txtHS = findViewById(R.id.mahadevTxt)
        chkHS = findViewById(R.id.ChkHS)

        chkHS.setOnClickListener {

            if (chkHS.isChecked) {
                txtHS.visibility = View.INVISIBLE
            } else {
                txtHS.visibility = View.VISIBLE
            }
        }
    }
}