package com.android.uz.infoapp.data.sources;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreferences {
    public static SharedPreferences sharedPref;

    private MySharedPreferences() {
    }

    public static MySharedPreferences getInstance(Context context) {
        if (sharedPref == null) {
            sharedPref = context.getSharedPreferences("Quiz", Context.MODE_PRIVATE);
        }
        return new MySharedPreferences();
    }

    public void saveBestQuiz1(int c) {
        sharedPref.edit().putInt("best1", c).apply();
    }
    public int getBestQuiz1() {
        return sharedPref.getInt("best1", 0);
    }
    public void saveBestQuiz2(int c) {
        sharedPref.edit().putInt("best2", c).apply();
    }
    public int getBestQuiz2() {
        return sharedPref.getInt("best2", 0);
    }
    public void saveBestQuiz3(int c) {
        sharedPref.edit().putInt("best3", c).apply();
    }
    public int getBestQuiz3() {
        return sharedPref.getInt("best3", 0);
    }


}
