package com.example.codewithakshay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun click(view: View) {
        val enterYourName:EditText = findViewById(R.id.enterYourName)

        val name = enterYourName.editableText.toString()

        val intent = Intent(this,BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.Name_Extra,name)
        startActivity(intent)
    }
}