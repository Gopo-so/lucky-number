package com.example.luckynumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b1: Button = findViewById(R.id.btn)
        val text: TextView = findViewById(R.id.textView)
        val edtxt: EditText = findViewById(R.id.editText)
        b1.setOnClickListener(){
            var username = edtxt.text
            //explicit intents, changing screen
            var i = Intent(this, Activity2::class.java)
            //passing user input
            i.putExtra("name",username)
            startActivity(i)

        }
    }
}