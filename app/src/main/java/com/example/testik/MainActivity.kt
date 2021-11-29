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
            "Найди правильный пример \n\n A) 2 + 3 = 5 \n\n B) 1 + 1 = 3 \n\n C) 4 - 2 = 6",
            "Где в примере допущена ошибка? \n\n A) 5 + 2 = 7 \n\n B) 7 - 1 = 3 \n\n C) 4 + 3 = 7",
            "Сколько слогов в слове Арбуз? \n\n A) один \n\n B) два \n\n C) три",
            "На тарелке лежали три помидора и два яблока. Сколько всего фруктов лежало на тарелке? \n\n A) 5 \n\n B) 3 \n\n C) 2"
        )
        var rightAnswers = listOf(1, 2, 2, 3)



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