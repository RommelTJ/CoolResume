package com.rommelrico.coolresume

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var workHistory = findViewById<Button>(R.id.workHistoryButton)
        workHistory.setOnClickListener {
            var moveToWorkHistory = Intent(getApplicationContext(), WorkHistoryActivity::class.java)
            startActivity(moveToWorkHistory)
        }

        var callButton = findViewById<Button>(R.id.callButton)
        callButton.setOnClickListener {
            var phoneURI = Uri.parse("tel:6192609789")
            var callIntent = Intent(Intent.ACTION_DIAL, phoneURI)
            startActivity(callIntent)
        }

        var emailButton = findViewById<Button>(R.id.emailButton)
        emailButton.setOnClickListener {
            var emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.setType("plain/text")
            emailIntent.putExtra(Intent.EXTRA_EMAIL, "rommeltj@gmail.com")
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Nice Resume :)")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "I really enjoyed your resume...")
            startActivity(emailIntent)
        }


    }
}
