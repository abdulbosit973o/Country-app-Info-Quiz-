package com.android.uz.infoapp.presentation.main;

import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android.uz.infoapp.R;
import com.android.uz.infoapp.presentation.category.CategoryActivity;
import com.android.uz.infoapp.presentation.country.Country_activity;
import com.android.uz.infoapp.presentation.quiz.QuizActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
        getWindow().getDecorView().setSystemUiVisibility(uiOptions);


//
//        ArrayList<Integer> image = new ArrayList<>();
//        image.add(R.drawable.all);
//        image.add(R.drawable.africa1);
//        image.add(R.drawable.europe1);
//        image.add(R.drawable.asia);
//        image.add(R.drawable.australia);
//        image.add(R.drawable.americas);
//
//        ArrayList<String> country = new ArrayList<>();
//        country.add("All Countries");
//        country.add("Africa");
//        country.add("Europe");
//        country.add("Asia");
//        country.add("Australia");
//        country.add("Americas");
//
//        MainAdapter adapter = new MainAdapter(this, country, image);
//       RecyclerView recyclerView = findViewById(R.id.recycler);
//       recyclerView.setAdapter(adapter);
//       recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        findViewById(R.id.quizButton).setOnClickListener(v -> {
//            Intent intent = new Intent(MainActivity.this, CategoryActivity.class);
//            startActivity(intent);
//        });
        findViewById(R.id.quizButton).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, QuizActivity.class));
        });

        findViewById(R.id.allCountries).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Country_activity.class).putExtra("value", 1));
        });
        findViewById(R.id.africa).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Country_activity.class).putExtra("value", 2));
        });
        findViewById(R.id.europe).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Country_activity.class).putExtra("value", 3));
        });
        findViewById(R.id.asia).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Country_activity.class).putExtra("value", 4));
        });
        findViewById(R.id.australia).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Country_activity.class).putExtra("value", 5));
        });
        findViewById(R.id.americas).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Country_activity.class).putExtra("value", 6));
        });
    }

}