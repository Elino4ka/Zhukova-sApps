package com.example.testik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var questionNo = 0
        var textView = findViewById<TextView>(R.id.textView)
        var button = findViewById<Button>(R.id.button)
        var button2 = findViewById<Button>(R.id.button2)
        var button3 = findViewById<Button>(R.id.button3)

        var questions = listOf(
            "What are the two official languages for Android development? \n\n A) Kotlin and Java \n\n B) Java and Python \n\n C) Kotlin and Python",
            "How do you define a function in Kotlin? \n\n A) void \n\n B) var \n\n C) function",
            "What is a variable used for? \n\n A) To contain data \n\n B) To insert a random value \n\n C) Don't know",
            "What does SDK stand for in Android SDK? \n\n A) Software Development Kit \n\n B) Software Development Kotlin \n\n C) Something Don't Know"
        )
        var rightAnswers = listOf(1, 2, 1, 1)



        fun updateQuestion() {
            questionNo += 1
            textView.text = questions[questionNo]
        }

        fun showToast(answer: Int) = if (answer == rightAnswers[questionNo]) {
            Toast.makeText(applicationContext, "Молодец!", Toast.LENGTH_SHORT).show()
            updateQuestion()
        } else {
            Toast.makeText(applicationContext, "Ошибка!", Toast.LENGTH_SHORT).show()
        }



        button.setOnClickListener {
            showToast(1)
        }

        button2.setOnClickListener {
            showToast(2)
        }

        button3.setOnClickListener {
            showToast(3)
        }

    }

}