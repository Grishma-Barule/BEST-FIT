package com.example.bestfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

     lateinit var buttonworkouts : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonworkouts = findViewById(R.id.button2)

        buttonworkouts.setOnClickListener {
            val intent: Intent = Intent(applicationContext,workout::class.java)
            startActivity(intent)
        }



    }
}
