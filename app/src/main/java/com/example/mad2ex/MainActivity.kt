package com.example.mad2ex

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        <?xml version="1.0" encoding="utf-8"?>
        <layout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto">

        <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".HomeFragment">

        <com.google.android.material.floatingactionbutton.FloatingActionButton
        android:id="@+id/addNoteFab"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="20dp"
        android:layout_marginBottom="28dp"
        android:backgroundTint="#11A2F4"
        android:clickable="true"
        android:contentDescription="image"
        android:tintMode="@color/white"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:srcCompat="@drawable/add_icon" />

        <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/homeRecyclerView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:visibility="gone"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

        <ImageView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/emptyNotesImage"
        android:visibility="gone"
        android:src="@drawable/img4"/>

        </androidx.constraintlayout.widget.ConstraintLayout>
        </layout>
    }
}