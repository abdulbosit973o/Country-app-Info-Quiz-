package com.android.uz.infoapp.presentation.category;

import com.android.uz.infoapp.data.model.SelectedCategory;
import com.android.uz.infoapp.domain.AppController;

public class CategoryModel implements CategoryContract.Model{
    private AppController controller = AppController.getInstance();

    @Override
    public void selectCategoryFromType(SelectedCategory selectedCategory) {
        controller.setSelectCategory(selectedCategory);
    }
}
