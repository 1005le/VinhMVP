package com.example.vinhmvp.interactor.impl;

import android.os.Handler;

import com.example.vinhmvp.R;
import com.example.vinhmvp.interactor.MainInteractor;
import com.example.vinhmvp.model.Category;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MainInteractorImpl implements MainInteractor {
    @Inject
    public MainInteractorImpl() {
    }
    @Override
    public void onLoadCategories(List<Category> categories) {
    }

//Them , CallBack = MainInteracter
    public void getCategories(final MainInteractor mainInteractor) {
        final int DELEAY_MILLIS = 2000;
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                mainInteractor.onLoadCategories(createArrayList());
            }
        }, DELEAY_MILLIS);
    }

    private List<Category> createArrayList() {

        List<Category> categories = new ArrayList<>();

        categories.add(
                new Category("Food & Drink", R.drawable.icon_category_food, R.color.theme_green_background,
                        R.color.theme_green_primary));
        categories.add(new Category("General Knowledge", R.drawable.icon_category_knowledge,
                R.color.theme_yellow_background, R.color.theme_yellow_primary));
        categories.add(
                new Category("History", R.drawable.icon_category_history, R.color.theme_blue_background,
                        R.color.theme_blue_primary));
        categories.add(
                new Category("Geography", R.drawable.icon_category_geography, R.color.theme_red_background,
                        R.color.theme_red_primary));
        categories.add(new Category("Science and Nature", R.drawable.icon_category_science,
                R.color.theme_green_background, R.color.theme_green_primary));
        categories.add(new Category("TV & Movies", R.drawable.icon_category_tvmovies,
                R.color.theme_purple_background, R.color.theme_purple_primary));
        categories.add(
                new Category("Music", R.drawable.icon_category_science, R.color.theme_blue_background,
                        R.color.theme_blue_primary));
        categories.add(new Category("Entertainment", R.drawable.icon_category_entertainment,
                R.color.theme_red_background, R.color.theme_red_primary));
        categories.add(
                new Category("Sports", R.drawable.icon_category_sports, R.color.theme_purple_background,
                        R.color.theme_purple_primary));

        return categories;
    }
}