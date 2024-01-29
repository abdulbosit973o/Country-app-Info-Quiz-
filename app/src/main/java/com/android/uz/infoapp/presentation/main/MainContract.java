package com.android.uz.infoapp.presentation.main;

import com.android.uz.infoapp.data.model.SelectedCategory;

public interface MainContract {
    interface Model {

    }
    interface View{
       void openQuizTest();
    }
    interface Presenter{
        void selectedCategory(SelectedCategory selected);
    }

}
