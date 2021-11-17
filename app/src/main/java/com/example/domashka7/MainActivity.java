package com.example.domashka7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] units = new String[]{"один", "два", "три", "четыре", "пять", "шесть", "семь",
                "восемь", "девять"};
        String[] teens = new String[]{"одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать",
                "восемнадцать", "девятнадцать"};
        String[] dozens = new String[]{"десять", "двадцать", "тридцать", "сорок", "пятьдесят",
                "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] hundreds = new String[]{"сто", "двести", "триста", "четыреста", "пятьсот"};
        String[] declinationOfRub = new String[]{"рубль", "рубля", "рублей"};

        int minValue = 1;
        int maxValue = 599;

        int number = (int) (Math.random() * maxValue) + minValue;

        Log.d("DZ7", "" + number);

        StringBuilder result = new StringBuilder();
        if (number / 100 != 0)
            result.append(hundreds[(number / 100) - 1]);
        if ((number % 100) / 10 != 0)
            result
                    .append(" ")
                    .append(dozens[((number % 100) / 10) - 1]);
        if (number % 10 != 0)
            result
                    .append(" ")
                    .append(units[(number % 10) - 1]);
        if (number % 10 == 1)
            result
                    .append(" ")
                    .append(declinationOfRub[0]);
        else if (number % 10 >= 2 && number % 10 <= 4)
            result
                    .append(" ").append(declinationOfRub[1]);
        else if (number % 10 >= 5 || number % 10 == 0)
            result
                    .append(" ").append(declinationOfRub[2]);

        Log.d("DZ7", "" + result.toString());


    }
}
