package com.example.fitnesstraining

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.CountDownTimer
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class ExerciseActivity : AppCompatActivity() {

    val exercises = ExerciseDataBase.exercises
    private var exerciseIndex = 0
    private lateinit var currentExercise: Exercise
    private lateinit var timer: CountDownTimer

    private lateinit var toolbarTB: Toolbar
    private lateinit var coachingNameTV: TextView
    private lateinit var startBTN: Button
    private lateinit var exerciseTV: TextView
    private lateinit var descriptionTV: TextView
    private lateinit var timeTV: TextView
    private lateinit var nextBTN: Button
    private lateinit var exerciseGIV: ImageView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exercise)

        init()

        startBTN.setOnClickListener(this::onClick)
        nextBTN.setOnClickListener(this::onClick)

        setSupportActionBar(toolbarTB)
        setFields()

    }

    fun onClick(view: View?) {
        when (view?.id) {
            R.id.startBTN -> startWorkout()
            R.id.nextBTN -> completedExercise()
        }
    }

    private fun completedExercise() {
        timer.cancel()
        nextBTN.isEnabled = false
        startNextExercise()
    }

    private fun startWorkout() {
        exerciseIndex = 0
        coachingNameTV.text = getString(R.string.startCoaching)
        startBTN.isEnabled = false
        startBTN.text = getString(R.string.trainingProcess)
        startNextExercise()
    }

    private fun startNextExercise() {
        if (exerciseIndex < exercises.size) {
            currentExercise = exercises[exerciseIndex]
            exerciseTV.text = currentExercise.name
            descriptionTV.text = currentExercise.description
            exerciseGIV.setImageResource(exercises[exerciseIndex].gifImage)
            timeTV.text = formatTime(currentExercise.durationInSeconds)
            timer = object : CountDownTimer(
                currentExercise.durationInSeconds * 1000L,
                1000
            ) {
                override fun onTick(millisUntilFinished: Long) {
                    timeTV.text = formatTime((millisUntilFinished/1000).toInt())
                }

                override fun onFinish() {
                    timeTV.text = getString(R.string.endCoaching)
                    exerciseGIV.visibility = View.VISIBLE
                    nextBTN.isEnabled = true
                    exerciseGIV.setImageResource(0)
                }
            }.start()
            exerciseIndex++
        } else {
            exerciseTV.text = getString(R.string.endCoaching)
            descriptionTV.text = ""
            timeTV.text = ""
            nextBTN.isEnabled = false
            startBTN.isEnabled = true
            startBTN.text = getString(R.string.start_again)
        }
    }

    @SuppressLint("DefaultLocale")
    private fun formatTime(seconds: Int): String {
        val minutes = seconds / 60
        val remainingSeconds = seconds % 60
        return String.format("%02d:%02d", minutes, remainingSeconds)
    }

    private fun init() {
        toolbarTB = findViewById(R.id.toolbarExerciseTB)
        coachingNameTV = findViewById(R.id.headingTV)
        startBTN = findViewById(R.id.startBTN)
        exerciseTV = findViewById(R.id.exerciseTV)
        descriptionTV = findViewById(R.id.descriptionTV)
        timeTV = findViewById(R.id.timeTV)
        nextBTN = findViewById(R.id.nextBTN)
        exerciseGIV = findViewById(R.id.exerciseGIV)
    }

    fun  setFields() {
        coachingNameTV.text = intent.getStringExtra("name")
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