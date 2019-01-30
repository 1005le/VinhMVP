package com.example.vinhmvp.presenter;

import com.example.vinhmvp.model.Category;
import com.example.vinhmvp.view.MainView;

public interface MainPresenter extends BasePresenter<MainView> {

    void onResume();

    void onItemSelected(Category category, int position);
}