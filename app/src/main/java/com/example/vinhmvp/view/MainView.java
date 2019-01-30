package com.example.vinhmvp.view;

import android.support.annotation.UiThread;

import com.example.vinhmvp.model.Category;

import java.util.List;

@UiThread
public interface MainView {
    void showProgress();

    void hideProgress();

    void showCategories(List<Category> categories);

    void showMessage(String message);

}