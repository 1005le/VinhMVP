package com.example.vinhmvp.view.loader;

import android.support.annotation.NonNull;

import com.example.vinhmvp.presenter.BasePresenter;

/**
 * Factory to implement to create a presenter
 */
public interface PresenterFactory<T extends BasePresenter> {
    @NonNull
    T create();
}
