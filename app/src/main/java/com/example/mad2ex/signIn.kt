package com.example.mad2ex

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class signIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button = findViewById<Button>(R.id.login_btn)
        button.setOnClickListener {
            val intent = Intent(this, home::class.java) // Replace NextActivity with the actual name of the activity you want to navigate to
            startActivity(intent)
        }

        val register = findViewById<TextView>(R.id.login_text)
        register.setOnClickListener {
            val intent = Intent(this, signUp::class.java) // Replace NextActivity with the actual name of the activity you want to navigate to
            startActivity(intent)
        }
    }
}