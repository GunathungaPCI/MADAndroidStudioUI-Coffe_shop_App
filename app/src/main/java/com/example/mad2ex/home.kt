package com.example.mad2ex

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val uiux = findViewById<LinearLayout>(R.id.lin1_btn)
        uiux.setOnClickListener {
            val intent = Intent(this, viewjob::class.java) // Replace NextActivity with the actual name of the activity you want to navigate to
            startActivity(intent)
        }
        val image= findViewById<ImageView>(R.id.profile_btn)
        image.setOnClickListener {
            val intent = Intent(this, profile::class.java) // Replace NextActivity with the actual name of the activity you want to navigate to
            startActivity(intent)
        }

    }
}