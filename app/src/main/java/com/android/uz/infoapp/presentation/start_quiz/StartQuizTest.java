package com.android.uz.infoapp.presentation.start_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.android.uz.infoapp.presentation.quiz.QuizActivity;
import com.android.uz.infoapp.R;

public class StartQuizTest extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz_test);

        findViewById(R.id.startQuiz).setOnClickListener(v -> {
            Intent intent = new Intent(StartQuizTest.this, QuizActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.finishStart).setOnClickListener(v -> finish());
    }
}