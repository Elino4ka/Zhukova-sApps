package com.zhukova.dz6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int i = 0;

        String[] units = new String[Units.values().length];
        for (Units u : Units.values()) {
            units[i++] = u.title;
        }

        i = 0;
        String[] teens = new String[Teens.values().length];
        for (Teens t : Teens.values()) {
            teens[i++] = t.title;
        }

        i = 0;
        String[] dozens = new String[Dozens.values().length];
        for (Dozens d : Dozens.values()) {
            dozens[i++] = d.title;
        }

        i = 0;
        String[] hundreds = new String[Hundreds.values().length];
        for (Hundreds h : Hundreds.values()) {
            hundreds[i++] = h.title;
        }

        i = 0;
        String[] rubs = new String[Rub.values().length];
        for (Rub r : Rub.values()) {
            rubs[i++] = r.title;
        }


        int minValue = 1;
        int maxValue = 599;

        int number = (int) (Math.random() * maxValue) + minValue;

        System.out.println(number);

        int h = 0;
        int d = 0;
        int t = 0;
        int u = 0;
        int r = 0;

        h = number / 100;
        d = number % 100;
        u = d % 10;

        if (d < 10) {
            d = 0;
        } else if (d < 20) {
            t = d - 10;
            u = 0;
            d = 0;
        } else {
            d = d / 10;
        }
        if (u >= 2 && u <= 4) {
            r = 1;
        } else if (u == 0 || u >= 5) {
            r = 2;
        }
        Log.d("DZ6", String.format("h=%d d=%d t=%d u=%d r=%d", h, d, t, u, r));
        String result = String.join(" ", hundreds[h], dozens[d], teens[t], units[u], rubs[r]);
        while (result.contains("  ")) {
            result = result.replace("  ", " ");
        }
        Log.d("DZ6", result);
    }


}

