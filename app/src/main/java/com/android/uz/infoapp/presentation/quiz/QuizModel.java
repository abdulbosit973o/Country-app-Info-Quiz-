package com.android.uz.infoapp.presentation.quiz;

import com.android.uz.infoapp.data.model.QuestionData;
import com.android.uz.infoapp.data.model.SelectedCategory;
import com.android.uz.infoapp.domain.AppController;

import java.util.List;

public class QuizModel implements QuizContract.Model{
    private AppController controller = AppController.getInstance();


    @Override
    public List<QuestionData> getQuestionByClickedCategory() {
        return controller.getQuestionShuffle();
    }
}
