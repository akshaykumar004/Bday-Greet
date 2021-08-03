 package com.example.codewithakshay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

 class BirthdayGreetingActivity : AppCompatActivity() {

    companion object {
        const val Name_Extra = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val birthdayGreeting:TextView = findViewById(R.id.birthdayGreeting)
        val name  = intent.getStringExtra(Name_Extra)
        birthdayGreeting.text = "Happy Birthday\n$name..!"
    }
}