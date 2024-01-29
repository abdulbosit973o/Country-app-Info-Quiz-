package com.android.uz.infoapp.presentation.country;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.android.uz.infoapp.R;
import com.android.uz.infoapp.presentation.category.CategoryActivity;
import com.android.uz.infoapp.presentation.country_info.CountryInfo;

public class Country_activity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        int getClick = getIntent().getIntExtra("value", 1);
        switch (getClick) {
            case 1 : {
                setContentView(R.layout.activity_country);
//                findViewById(R.id.finishCountryInfo).setOnClickListener(v -> finish());
//                findViewById(R.id.hongkong).setOnClickListener(v -> onClickScreenSendPos(0));
//                findViewById(R.id.usa).setOnClickListener(v -> onClickScreenSendPos(1));
//                findViewById(R.id.sudan).setOnClickListener(v -> onClickScreenSendPos(2));
//                findViewById(R.id.yemen).setOnClickListener(v -> onClickScreenSendPos(3));
//                findViewById(R.id.china).setOnClickListener(v -> onClickScreenSendPos(4));
//                findViewById(R.id.vietnam).setOnClickListener(v -> onClickScreenSendPos(5));
//                findViewById(R.id.pakistan).setOnClickListener(v -> onClickScreenSendPos(6));
//                findViewById(R.id.bahrein).setOnClickListener(v -> onClickScreenSendPos(7));
//                findViewById(R.id.costarica).setOnClickListener(v -> onClickScreenSendPos(8));
                break;
            }
            case 2 : {
                setContentView(R.layout.activity_africa);
//                findViewById(R.id.china).setOnClickListener(v -> onClickScreenSendPos(4));
//                findViewById(R.id.vietnam).setOnClickListener(v -> onClickScreenSendPos(5));
//                findViewById(R.id.pakistan).setOnClickListener(v -> onClickScreenSendPos(6));
//                findViewById(R.id.bahrein).setOnClickListener(v -> onClickScreenSendPos(7));
//                findViewById(R.id.costarica).setOnClickListener(v -> onClickScreenSendPos(8));

                break;
            }
            case 3: {
                setContentView(R.layout.activity_europe);
                break;
            }
            case 4: {
                setContentView(R.layout.activity_asia);
                break;
            }
            case 5: {
                setContentView(R.layout.activity_australia);
                break;
            }
            default: {
                setContentView(R.layout.activity_america);
            }

        }


//        findViewById(R.id.quizButton).setOnClickListener(v -> {
//            Intent intent = new Intent(Country_activity.this, CategoryActivity.class);
//            startActivity(intent);
//            finish();
//        });


    }
    void onClickScreenSendPos(int pos) {
        Intent intent = new Intent(Country_activity.this, CountryInfo.class);
        intent.putExtra("POS", pos);
        startActivity(intent);
    }
}