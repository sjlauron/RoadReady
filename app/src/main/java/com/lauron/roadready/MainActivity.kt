package com.lauron.roadready

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    private val DELAY_MILLIS = 3000 // 3 seconds
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Use Handler to delay the start of the next activity
        Handler(Looper.getMainLooper()).postDelayed({
            // Start the next activity after the delay
            startActivity(Intent(this, LoginActivity::class.java))
            finish() // Close the current activity
        }, DELAY_MILLIS.toLong())
    }
}