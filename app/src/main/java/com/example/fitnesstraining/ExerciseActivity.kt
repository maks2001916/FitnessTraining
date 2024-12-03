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
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.felipecsl.gifimageview.library.GifImageView

class ExerciseActivity : AppCompatActivity() {

    private lateinit var toolbarTB: Toolbar
    private lateinit var coachingNameTV: TextView
    private lateinit var startBTN: Button
    private lateinit var exerciseTV: TextView
    private lateinit var timeTV: TextView
    private lateinit var nextBTN: Button
    private lateinit var exerciseGIV: GifImageView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exercise)

        toolbarTB = findViewById(R.id.toolbarExerciseTB)
        coachingNameTV = findViewById(R.id.coachingNameET)
        startBTN = findViewById(R.id.startBTN)
        exerciseTV = findViewById(R.id.exerciseTV)
        timeTV =findViewById(R.id.timeTV)
        nextBTN = findViewById(R.id.nextBTN)
        exerciseGIV = findViewById(R.id.exerciseGIV)


        setSupportActionBar(toolbarTB)

    }
}