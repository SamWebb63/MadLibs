package com.example.madlibs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val nn1 = findViewById<EditText>(R.id.nn1)
        val vrb1 = findViewById<EditText>(R.id.vrb1)
        val nn2 = findViewById<EditText>(R.id.nn2)
        val nn3 = findViewById<EditText>(R.id.nn3)
        val nn4 = findViewById<EditText>(R.id.nn4)
        val vrb2 = findViewById<EditText>(R.id.vrb2)
        val vrb3 = findViewById<EditText>(R.id.vrb3)
        val vrb4 = findViewById<EditText>(R.id.vrb4)
        val nn5 = findViewById<EditText>(R.id.nn5)
        val nn6 = findViewById<EditText>(R.id.nn6)
        val vrb5 = findViewById<EditText>(R.id.vrb5)

        
    }

}
