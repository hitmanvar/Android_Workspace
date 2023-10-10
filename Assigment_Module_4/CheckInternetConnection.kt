package com.example.assignment_4

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.media.ImageWriter
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService
import org.w3c.dom.Text

@Suppress("DEPRECATION")
class CheckInternetConnection : AppCompatActivity() {

    lateinit var txt1: TextView
    lateinit var btnClick: Button
    lateinit var imgChk: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_internet_connection)

        txt1 = findViewById(R.id.textView)
        btnClick = findViewById(R.id.btnChkNet)
        imgChk = findViewById(R.id.imgConnect)

     /*   txt1.setTextColor(Color.parseColor("#A3BCD4"))*/

        btnClick.setOnClickListener {

            if (isConnected()) {

                imgChk.setImageResource(R.drawable.wifion)
                txt1.text = "You Are Connected To Internet"
               txt1.setTextColor(Color.parseColor("#1D5D9B"))
            }
            else {

                imgChk.setImageResource(R.drawable.wifioff)
                  txt1.text = "You Are Not Connected To Internet"
                txt1.setTextColor(Color.parseColor("#7E1717"))
            }

        }
    }

     fun isConnected() : Boolean {

        val cm = applicationContext.getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
        val nInfo = cm.activeNetworkInfo

         if (nInfo != null)
         {
             return nInfo.isConnected
         }
         else{
             return false
         }
     }
}
