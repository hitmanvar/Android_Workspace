package com.example.assignment_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.Toast

class WebViewDemo : AppCompatActivity() {

    lateinit var web1: WebView
    lateinit var btnBack : Button
    lateinit var btnNext : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_demo)

        web1 = findViewById(R.id.web1)
        btnBack = findViewById(R.id.btnBack)
        btnNext = findViewById(R.id.btnNxt)

        web1.webViewClient = WebViewClient()

        web1.loadUrl("https://www.google.co.in/")

        web1.settings.javaScriptEnabled = true
        web1.settings.setSupportZoom(true)

        btnBack.setOnClickListener {

            if(web1.canGoBack()){
                //Toast.makeText(applicationContext, "back"+web1.goBack(), Toast.LENGTH_SHORT).show()
                web1.goBack()

            }
        }

        btnNext.setOnClickListener {

            if(web1.canGoForward()){
                //Toast.makeText(applicationContext, "nxt"+web1.goForward(), Toast.LENGTH_SHORT).show()
                web1.goForward()

            }
        }
    }
}