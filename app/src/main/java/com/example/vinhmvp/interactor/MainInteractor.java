package com.example.vinhmvp.interactor;

import com.example.vinhmvp.model.Category;

import java.util.List;

public interface MainInteractor extends BaseInteractor {
    void onLoadCategories(List<Category> categories);
}