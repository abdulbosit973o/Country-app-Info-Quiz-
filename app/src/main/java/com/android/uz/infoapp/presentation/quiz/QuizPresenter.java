package com.android.uz.infoapp.presentation.quiz;

import android.content.Intent;
import android.widget.TextView;

import com.android.uz.infoapp.data.model.QuestionData;
import com.android.uz.infoapp.data.model.SelectedCategory;
import com.android.uz.infoapp.presentation.main.MainContract;

import java.util.ArrayList;
import java.util.List;

public class QuizPresenter implements QuizContract.Presenter {
    QuizContract.View view;
    QuizContract.Model model;
    List<QuestionData> list = new ArrayList<>();
    int currQuestion = 0;
    int selectedIndex = -1;
    public int correct = 0;

    public QuizPresenter(QuizContract.View view) {
        this.view = view;
        model = new QuizModel();

        loadQuestionsByCategory();
        loadQuestionsByPos();
    }

    @Override
    public void loadQuestionsByCategory() {
        list = model.getQuestionByClickedCategory();
    }

    @Override
    public void loadQuestionsByPos() {
        view.describeQuestion(list.get(currQuestion));
    }

    @Override
    public void selectIndex(int pos) {
        if (selectedIndex == pos) return;
        if (selectedIndex > -1) {
            view.clearOldStates(selectedIndex);
        }
        selectedIndex = pos;
        view.nextButtonState(true);
        view.openSelectIndex(pos);
    }

    @Override
    public void clickNextButton() {
        if (selectedIndex == -1)return;
        QuestionData data = list.get(currQuestion);
        String[] variant = data.getVariants();
        if (data.getAnswer().equals(variant[selectedIndex])) {
            correct++;
        }
        view.nextButtonState(false);
        view.clearOldStates(selectedIndex);
        selectedIndex = -1;
        currQuestion++;

        int pos = currQuestion +1;
            view.resetQuestionNumber(pos);


        if (currQuestion == list.size()) {
            view.openResultScreen();
        } else {
            view.describeQuestion(list.get(currQuestion));
        }

    }

    @Override
    public int getCorrectAnswers() {
        return correct;
    }

    @Override
    public int getMaxQuestionSize() {
        return list.size();
    }

    @Override
    public void finishQuiz() {
        view.openResultScreen();
    }

}
