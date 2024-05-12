package com.example.mobile_esterikasimangunsong

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.android.synthetic.main.activity_main.btn_1
import kotlinx.android.synthetic.main.activity_main.btn_2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        btnLoginListener()
        btnRegisterListener()
        }

    private fun btnLoginListener() {
    btn_1.setOnClickListener {
        startActivity(Intent(this, LoginActivity::class.java))
}
    }

    private fun btnRegisterListener() {
        btn_2.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

}