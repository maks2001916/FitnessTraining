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
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private var GALLERY_REQUEST = 302
    var photoUri: Uri? = null

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

        imageIV.setOnClickListener {
            val photoPickerIntent = Intent(Intent.ACTION_PICK)
            photoPickerIntent.type = "image/*"
            startActivityForResult(photoPickerIntent, GALLERY_REQUEST)
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {R.id.exit -> finish() }
        return super.onOptionsItemSelected(item)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == GALLERY_REQUEST && resultCode == RESULT_OK) {
            photoUri = data?.data
            imageIV.setImageURI(photoUri)
        }
    }
}