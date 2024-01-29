package com.android.uz.infoapp.presentation.quiz;

import com.android.uz.infoapp.data.model.QuestionData;
import com.android.uz.infoapp.data.model.SelectedCategory;

import java.util.List;

public interface QuizContract {
    interface Model{
        List<QuestionData> getQuestionByClickedCategory();
    }
    interface View{
        void describeQuestion(QuestionData data);
        void clearOldStates(int pos);
        void nextButtonState(boolean bool);
        void openSelectIndex(int pos);
        void openResultScreen();
        void resetQuestionNumber(int pos);

    }
    interface Presenter{
        void loadQuestionsByCategory();
        void loadQuestionsByPos();
        void selectIndex(int pos);
        void clickNextButton();
        int getCorrectAnswers();
        int getMaxQuestionSize();
        void finishQuiz();
    }
}
