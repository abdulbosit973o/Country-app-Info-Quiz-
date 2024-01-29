package com.android.uz.infoapp.presentation.finish_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.uz.infoapp.R;
import com.android.uz.infoapp.data.sources.MySharedPreferences;

import org.w3c.dom.Text;

public class FinishQuizTest extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_quiz_test);
        MySharedPreferences shared = MySharedPreferences.getInstance(this);
        TextView best = findViewById(R.id.bestScore);
        findViewById(R.id.cancel).setOnClickListener(v-> finish());

        int getCorrect = getIntent().getIntExtra("Correct", 0);
        int getMaxSize =getIntent().getIntExtra("MaxSize", 0);

        double calc = ((double) getCorrect / getMaxSize) * 100;
        int curr = (int) calc;
        TextView percentage = findViewById(R.id.win_percentage);
        TextView text = findViewById(R.id.textResult);
        text.setText("Your attempted " + getMaxSize + " questions\nfrom that " + getCorrect +" answers right");
        percentage.setText(curr + "%");

        int intent = getIntent().getIntExtra("category", 1);
        switch (intent) {
            case 1: {
                int max = shared.getBestQuiz1();
                int max1 = Math.max(getCorrect, max);
                shared.saveBestQuiz1(max1);
                best.setText("Your best score is: " + max1);
                break;
            }
            case 2: {
                int max = shared.getBestQuiz2();
                int max1 = Math.max(getCorrect, max);
                shared.saveBestQuiz2(max1);
                best.setText("Your best score is: " + max1);
                break;
            }
            case 3: {
                int max = shared.getBestQuiz3();
                int max1 = Math.max(getCorrect, max);
                shared.saveBestQuiz3(max1);
                best.setText("Your best score is: " + max1);
                break;
            }
        }






    }
}