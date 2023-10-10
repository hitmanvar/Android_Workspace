package com.example.assignment_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TableLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.marginBottom
import androidx.core.view.marginTop
import org.w3c.dom.Text

class TextViewTableLAyout : AppCompatActivity() {
    lateinit var tabLayout : TableLayout
    lateinit var txt : TextView
    lateinit var edtnum:EditText
    lateinit var btnGenerate :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view_table_layout)

        tabLayout = TableLayout(this)
        txt = TextView(this)
        edtnum = EditText(this)
        btnGenerate = Button(this)

        txt.setText("MAHADEV")
        btnGenerate.setText("Click")
        edtnum.setHint("Enter Number")

        var height = ViewGroup.LayoutParams.WRAP_CONTENT
        var width = ViewGroup.LayoutParams.MATCH_PARENT

        tabLayout.addView(txt,width,height)
        tabLayout.addView(edtnum,width,height)
        tabLayout.addView(btnGenerate,width,height)

        setContentView(tabLayout)

        edtnum.text.toString()

        btnGenerate.setOnClickListener {

            var num1 = Integer.parseInt(edtnum.text.toString())

            for(j in 1..num1){

             var  edtnum1 = EditText(this)
                edtnum1.setHint("Enter Number")

                edtnum1.layoutParams =TableLayout.LayoutParams(width,height)
                tabLayout.addView(edtnum1)
            }
        }
    }
}