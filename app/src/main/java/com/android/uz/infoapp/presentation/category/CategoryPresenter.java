package com.android.uz.infoapp.presentation.category;

import com.android.uz.infoapp.data.model.SelectedCategory;
import com.android.uz.infoapp.presentation.main.MainModel;

public class CategoryPresenter implements CategoryContract.Presenter {
    CategoryContract.View view;
    CategoryContract.Model model;

    public CategoryPresenter(CategoryContract.View view) {
        this.model = new CategoryModel();
        this.view = view;
    }

    @Override
    public void setSelectedCategory(SelectedCategory select) {
        model.selectCategoryFromType(select);
        view.openQuizGame(select);
    }

    @Override
    public void swapScreen() {
        view.finishCategory();
    }
}
