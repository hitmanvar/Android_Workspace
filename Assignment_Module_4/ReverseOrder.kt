package com.example.assignment_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar

class ReverseOrder : AppCompatActivity() {
    lateinit var edtUserTxt : EditText
    lateinit var txtReverse : TextView
    lateinit var edtNum1 : EditText
    lateinit var edtNum2 : EditText
    lateinit var btnClick : Button
   // lateinit var txtResult : TextView
    lateinit var btnGo:Button
    lateinit var btnNewModule : Button
    lateinit var radiobtnColor : Button
    lateinit var btnHS : Button
    lateinit var btnSeek : Button
    lateinit var btnList:Button
    lateinit var btnToolBar:Button
    lateinit var btnImgMargin: Button
    lateinit var btnChkNet : Button
    lateinit var btnFragmentTask:Button
    lateinit var btnToolCustom:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reverse_order)

        edtUserTxt = findViewById(R.id.edtTxt)
        txtReverse = findViewById(R.id.txtReverse)
        edtNum1 = findViewById(R.id.edtNum1)
        edtNum2 = findViewById(R.id.edtNum2)
        btnClick = findViewById(R.id.btnClick)
       // txtResult = findViewById(R.id.txtResult)
        btnGo = findViewById(R.id.btnGo)
        btnNewModule = findViewById(R.id.btnNewTasksModule)
        radiobtnColor = findViewById(R.id.btnRadioBtnColor)
        btnHS = findViewById(R.id.btnChk)
        btnSeek = findViewById(R.id.btnSeekbarAct)
        btnList = findViewById(R.id.btnListAct)
        btnToolBar = findViewById(R.id.btnToolBarAct)
        btnImgMargin = findViewById(R.id.btnImageMarginTextView)
        btnChkNet = findViewById(R.id.btnchkNetwork)
        btnFragmentTask = findViewById(R.id.btnFragmentTask)
        btnToolCustom = findViewById(R.id.btnCustomToolbar)

        edtUserTxt.setOnClickListener {

            var msg = edtUserTxt.text.toString()

            txtReverse.text.toString()

            txtReverse.setText(msg.reversed())

        }
        edtNum1.setOnClickListener {
            edtNum1.text.toString()

        }
        edtNum1.setOnClickListener {
            edtNum2.text.toString()

        }
        btnClick.setOnClickListener{

            var num1 = Integer.parseInt(edtNum1.text.toString())
            var num2 = Integer.parseInt(edtNum2.text.toString())

            var loop:StringBuffer = StringBuffer("The Num is : ")

            for (j in num1..num2) {

                loop.append("\n $j")

            }

            var i = Intent(applicationContext,PrintAllNumbers::class.java)
            i.putExtra("num",loop.toString())
            startActivity(i)

        }

        btnGo.setOnClickListener {
            var i = Intent(applicationContext,RadioButton::class.java)
            startActivity(i)

        }

        btnNewModule.setOnClickListener {
            var i = Intent(applicationContext,Module4NewTasks::class.java)
            startActivity(i)

        }

        radiobtnColor.setOnClickListener {
             var i = Intent(applicationContext,RadioButtonBgColor::class.java)
            startActivity(i)
        }

        btnHS.setOnClickListener {
            var i = Intent(applicationContext,HideShowTxtViewChkBox::class.java)
            startActivity(i)
        }

        btnSeek.setOnClickListener {
            var i = Intent(applicationContext,SeekBarActivity::class.java)
            startActivity(i)
        }

        btnList.setOnClickListener {
            var i = Intent(applicationContext,ListViewString::class.java)
            startActivity(i)
        }

        btnToolBar.setOnClickListener {
            var i = Intent(applicationContext,ToolBarActivity::class.java)
            startActivity(i)
        }

        btnImgMargin.setOnClickListener {
            var i = Intent(applicationContext,ImageAroundTextView::class.java)
            startActivity(i)

        }

        btnChkNet.setOnClickListener {
            var i = Intent(applicationContext,CheckInternetConnection::class.java)
            startActivity(i)

        }

        btnFragmentTask.setOnClickListener {
            var i = Intent(applicationContext,FragmentTaskActivity::class.java)
            startActivity(i)

        }

        btnToolCustom.setOnClickListener {
            var i = Intent(applicationContext,ToolbarCustomDesignWP::class.java)
            startActivity(i)
        }
    }
}

