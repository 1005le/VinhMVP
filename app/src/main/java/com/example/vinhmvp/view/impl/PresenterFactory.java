package com.example.vinhmvp.view.impl;

import android.support.annotation.NonNull;

import com.example.vinhmvp.presenter.MainPresenter;

public abstract class PresenterFactory<T> {
    @NonNull
    public abstract MainPresenter create();
}
