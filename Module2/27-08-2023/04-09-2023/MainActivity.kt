package com.example.cafeapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed(Runnable {
            var i = Intent(applicationContext,LoginPage::class.java)
            startActivity(i)

        },3000)

    }

    override fun onBackPressed()
    {
        //finishAffinity()

        var alert = AlertDialog.Builder(this)
        alert.setTitle("Are you sure you want to exit?")
        alert.setPositiveButton("YES",{ dialogInterface: DialogInterface, i: Int ->

            finishAffinity()
        })
        alert.setNegativeButton("NO",{ dialogInterface: DialogInterface, i: Int ->

            dialogInterface.cancel()
        })
        alert.show()


    }
}