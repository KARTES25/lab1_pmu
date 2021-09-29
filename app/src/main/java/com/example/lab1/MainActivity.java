package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static int max(int ... vals) {
        int max = vals[0];
        for (int i : vals) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public static int min(int ... vals) {
        int min = vals[0];
        for (int i : vals) {
            if (i < min)
                min = i;
        }
        return min;
    }


}