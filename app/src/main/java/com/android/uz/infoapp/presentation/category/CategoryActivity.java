package com.android.uz.infoapp.presentation.category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.uz.infoapp.R;
import com.android.uz.infoapp.data.model.SelectedCategory;
import com.android.uz.infoapp.data.sources.MySharedPreferences;
import com.android.uz.infoapp.presentation.quiz.QuizActivity;

public class CategoryActivity extends AppCompatActivity implements CategoryContract.View {

    CategoryContract.Presenter presenter;
    MySharedPreferences myPref;
    @Override
    @SuppressLint({"MissingInflatedId", "LocalSuppress", "SetTextI18n"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        myPref = MySharedPreferences.getInstance(this);



//        findViewById(R.id.homeButton).setOnClickListener(v -> finish());
        presenter = new CategoryPresenter(this);
        initViews();
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onResume() {
        TextView best1 = findViewById(R.id.capitalBest);
        best1.setText(String.valueOf(myPref.getBestQuiz1()));

        TextView best2 = findViewById(R.id.flagBest);
        best2.setText(String.valueOf(myPref.getBestQuiz2()));

        TextView best3 = findViewById(R.id.regionBest);
        best3.setText(String.valueOf(myPref.getBestQuiz3()));
        super.onResume();
    }

    public void initViews() {
        findViewById(R.id.homeBtn).setOnClickListener(v -> presenter.swapScreen());
        AppCompatImageView imageView1 = findViewById(R.id.img_first_quiz);
        imageView1.setColorFilter(getResources().getColor(R.color.custom_color), PorterDuff.Mode.SRC_ATOP);
        findViewById(R.id.capitalStart).setOnClickListener(v -> presenter.setSelectedCategory(SelectedCategory.CAPITAL));


        AppCompatImageView imageView2 = findViewById(R.id.img_second_quiz);
        imageView2.setColorFilter(getResources().getColor(R.color.custom_color), PorterDuff.Mode.SRC_ATOP);
        findViewById(R.id.flagStart).setOnClickListener(v -> presenter.setSelectedCategory(SelectedCategory.FLAG));

        AppCompatImageView imageView3 = findViewById(R.id.img_third_quiz);
        imageView3.setColorFilter(getResources().getColor(R.color.custom_color), PorterDuff.Mode.SRC_ATOP);
        findViewById(R.id.regionStart).setOnClickListener(v -> presenter.setSelectedCategory(SelectedCategory.REGION));
    }

    @Override
    public void openQuizGame(SelectedCategory select) {
        Intent intent = new Intent(CategoryActivity.this, QuizActivity.class);
        int extra = 1;
        switch (select) {
            case CAPITAL: {
                break;
            }
            case FLAG: {
                extra = 2;
                break;
            }
            case REGION: {
                extra = 3;
                break;
            }
        }
        intent.putExtra("extra", extra);
        startActivity(intent);
    }

    @Override
    public void finishCategory() {
        finish();
    }
}