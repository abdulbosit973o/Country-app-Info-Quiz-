package com.android.uz.infoapp.presentation.category;

import com.android.uz.infoapp.data.model.SelectedCategory;

public interface CategoryContract {
    interface Model{
         void selectCategoryFromType(SelectedCategory selectedCategory);
    }
    interface Presenter{
        void setSelectedCategory(SelectedCategory select);
        void swapScreen();

    }
    interface View{
        void openQuizGame(SelectedCategory select);
        void finishCategory();
    }
}
