package com.example.fitnesstraining

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
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


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {R.id.exit -> finish() }
        return super.onOptionsItemSelected(item)
    }
}