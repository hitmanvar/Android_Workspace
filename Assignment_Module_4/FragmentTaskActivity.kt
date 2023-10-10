package com.example.assignment_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class FragmentTaskActivity : AppCompatActivity() {
    lateinit var btnLogin : Button
    lateinit var btnRegister : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_task)

        btnLogin = findViewById(R.id.btnLoginPage)
        btnRegister = findViewById(R.id.btnRegistrationForm)

        btnLogin.setOnClickListener {

            var fragmentLogin = LoginFragment()

            var fm:FragmentManager = supportFragmentManager
            var ft:FragmentTransaction = fm.beginTransaction()
            ft.replace(R.id.frmId,fragmentLogin).commit()
        }

        btnRegister.setOnClickListener {

            var fragmentRegistration = RegistrationFragment()

            var fm:FragmentManager = supportFragmentManager
            var ft:FragmentTransaction = fm.beginTransaction()

            ft.replace(R.id.frmId,fragmentRegistration).commit()
        }
    }
}