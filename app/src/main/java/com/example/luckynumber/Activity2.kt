package com.example.luckynumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val shareBtn: Button = findViewById(R.id.button)
        val luctxt: TextView = findViewById(R.id.luckynumtext)
        val textview2: Button = findViewById(R.id.button)
        var user_name = recieveUserName()
        var rand_number = randomInt()
        Toast.makeText(this, " "+user_name,Toast.LENGTH_LONG).show()
        luctxt.setText(" "+rand_number)

        shareBtn.setOnClickListener(){//sharing data
            sharedata(user_name,rand_number)
        }

    }
    fun recieveUserName():String{
        var bundle: Bundle? = intent.extras
        var username = bundle?.get("name").toString()
        return username
    }
    fun randomInt():Int{
        val random = Random.nextInt(100)
        return random
    }
    fun sharedata(username: String, num: Int){
        //implicit Intent ; connecting with other apps

        var i = Intent(Intent.ACTION_SEND)
        i.setType("text/plain")
        //i.putExtra(Intent.EXTRA_SUBJECT, "$username is lucky today")
        i.putExtra(Intent.EXTRA_TEXT,"$username is lucky today, his lucky num is $num")
        startActivity(i)
    }
}