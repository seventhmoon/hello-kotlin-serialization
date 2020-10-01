package com.google.sample.hellokotlinserialization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textviewText = findViewById<TextView>(R.id.textview_text)
        val json = "{\"brand\":\"Google\",\"name\":\"Pixel\"}"
        val device = Json { ignoreUnknownKeys = true }.decodeFromString<Device>(json)

        textviewText.text = device.toString()

    }
}
