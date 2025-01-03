package com.example.fitnesstraining

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
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
        startBTN = findViewById(R.id.startExerciseBTN)

        setSupportActionBar(toolbarTB)

        startBTN.setOnClickListener {
            if (checkFieldsIsNotEmpty()) {
                val intent = Intent(this, ExerciseActivity::class.java)
                intent.putExtra("name", coachingNameET.text.toString())
                startActivity(intent)
            } else {
                Toast.makeText(
                    applicationContext,
                    getString(R.string.notAllFieldsAreFilledIn),
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }

    fun checkFieldsIsNotEmpty(): Boolean {
        if (coachingNameET.text.isNotEmpty()) {
            return true
        }
        return false
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