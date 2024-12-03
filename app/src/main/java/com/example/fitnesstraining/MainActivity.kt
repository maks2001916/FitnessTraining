package com.example.fitnesstraining

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private lateinit var toolbarTB: Toolbar
    private lateinit var coachingNameET: EditText
    private lateinit var imageIV: ImageView
    private lateinit var sloganTV: TextView
    private lateinit var startBTN: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        toolbarTB = findViewById(R.id.toolbarMainTB)
        coachingNameET = findViewById(R.id.coachingNameET)
        imageIV = findViewById(R.id.imageInfoIV)
        sloganTV = findViewById(R.id.sloganTV)
        startBTN = findViewById(R.id.startBTN)

        setSupportActionBar(toolbarTB)

    }
}