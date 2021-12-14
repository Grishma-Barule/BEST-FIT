package com.example.bestfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_workout.*

class workout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout)
        val time = findViewById<EditText>(R.id.editTextt).text
        val weight = findViewById<EditText>(R.id.editTextW).text
        lateinit var buttonexercise : Button
        buttonexercise = findViewById(R.id.buttonex)
        buttonexercise.setOnClickListener {
            val intent: Intent = Intent(applicationContext,MainActivity2list::class.java)
               intent.putExtra("TIME",time.toString().toDouble())
                intent.putExtra("WEIGHT",weight.toString().toDouble()
                )

                   startActivity(intent)
        }
    }
}