package com.example.mobile_esterikasimangunsong

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.android.synthetic.main.activity_register.R_img_1
import kotlinx.android.synthetic.main.activity_register.txt_login

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        txtLoginListener()
        btnBackListener()
    }

    private fun txtLoginListener() {
        txt_login.setOnClickListener() {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    private fun btnBackListener() {
        R_img_1.setOnClickListener() {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}