package com.android.uz.infoapp.presentation.quiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.uz.infoapp.R;
import com.android.uz.infoapp.data.model.QuestionData;
import com.android.uz.infoapp.presentation.finish_quiz.FinishQuizTest;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity implements QuizContract.View {
    QuizContract.Presenter presenter;
    TextView question;
    TextView questionNumber;
    List<ImageView> checks;
    List<TextView> variants;
    List<ViewGroup> groupVariant;
    Button nextButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        loadViews();
        presenter = new QuizPresenter(this);
    }

    private void loadViews() {
        findViewById(R.id.finish).setOnClickListener(v -> presenter.finishQuiz());
        question = findViewById(R.id.text_question);
        nextButton = findViewById(R.id.btn_next);
        questionNumber = findViewById(R.id.questionNumber);
        checks = new ArrayList<>();
        checks.add(findViewById(R.id.image_variant1));
        checks.add(findViewById(R.id.image_variant2));
        checks.add(findViewById(R.id.image_variant3));
        checks.add(findViewById(R.id.image_variant4));

        variants = new ArrayList<>();
        variants.add(findViewById(R.id.text_variant1));
        variants.add(findViewById(R.id.text_variant2));
        variants.add(findViewById(R.id.text_variant3));
        variants.add(findViewById(R.id.text_variant4));

        groupVariant = new ArrayList<>();
        groupVariant.add(findViewById(R.id.container1));
        groupVariant.add(findViewById(R.id.container2));
        groupVariant.add(findViewById(R.id.container3));
        groupVariant.add(findViewById(R.id.container4));

        for (int i = 0; i < groupVariant.size(); i++) {
            int ind = i;
            groupVariant.get(i).setOnClickListener(v -> presenter.selectIndex(ind));
        }

        findViewById(R.id.btn_next).setOnClickListener(v -> presenter.clickNextButton());

    }

    @Override
    public void describeQuestion(QuestionData data) {
        question.setText(data.getQuestion());
        for (int i = 0; i < variants.size(); i++) {
            variants.get(i).setText(data.getVariants()[i]);
        }
    }

    @Override
    public void clearOldStates(int pos) {
        checks.get(pos).setImageResource(R.drawable.ic_unchecked);
    }

    @Override
    public void nextButtonState(boolean bool) {
        nextButton.setEnabled(bool);
    }

    @Override
    public void openSelectIndex(int pos) {
        checks.get(pos).setImageResource(R.drawable.ic_check);
    }

    @Override
    public void openResultScreen() {
        Intent intent = new Intent(this, FinishQuizTest.class);
        intent.putExtra("Correct", presenter.getCorrectAnswers());
        intent.putExtra("MaxSize", presenter.getMaxQuestionSize());
        intent.putExtra("category", getIntent().getIntExtra("extra", 1));
        startActivity(intent);
        finish();
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void resetQuestionNumber(int pos) {
        questionNumber.setText("#"+ pos);
    }

}
