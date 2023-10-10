package com.example.assignment_4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.view.marginBottom
import androidx.core.view.marginLeft
import androidx.core.view.marginRight
import androidx.core.view.marginTop

class ImageAroundTextView : AppCompatActivity() {

        lateinit var t1:TextView

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_around_text_view)

            t1= findViewById(R.id.t1)

            t1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground)

    }
}