package edu.temple.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {

    // TODO Step 1: Launch TextSizeActivity when button clicked to allow selection of text size value

    // TODO Step 3: Use returned value for lyricsDisplayTextView text size

    private lateinit var lyricsDisplayTextView: TextView
    private lateinit var textSizeSelectorButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // Initialize the TextView and Button by finding them by their ID in the layout
        lyricsDisplayTextView = findViewById(R.id.lyricsDisplayTextView)
        textSizeSelectorButton = findViewById(R.id.textSizeSelectorButton)

        // Step 1: Set up the button's click listener
        textSizeSelectorButton.setOnClickListener {
            // Create an Intent to launch TextSizeActivity when the button is clicked
            val intent = Intent(this, TextSizeActivity::class.java)

            // Start TextSizeActivity without expecting a result at this point
            startActivity(intent)
        }
    }
}
