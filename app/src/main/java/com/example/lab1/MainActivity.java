package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Finds maximal value of given ones.
     * @param vals - list of given values.
     * @return maximal value.
     */
    public static int max(int ... vals) {
        int max = vals[0];
        for (int i : vals) {
            if (i > max)
                max = i;
        }
        return max;
    }
    /**
     * Finds minimal value of given ones.
     * @param vals - list of given values.
     * @return minimal value.
     */
    public static int min(int ... vals) {
        int min = vals[0];
        for (int i : vals) {
            if (i < min)
                min = i;
        }
        return min;
    }


}