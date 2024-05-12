package com.example.mobile_esterikasimangunsong

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.android.synthetic.main.activity_login.L_img_1
import kotlinx.android.synthetic.main.activity_login.txt_register

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        btnBackLoginListener()
        txtLRegisterListener()
    }
    private fun btnBackLoginListener () {
        L_img_1.setOnClickListener {
              startActivity(Intent(this, MainActivity::class.java))
        }

    }

    private fun txtLRegisterListener () {
        txt_register.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

    }

}