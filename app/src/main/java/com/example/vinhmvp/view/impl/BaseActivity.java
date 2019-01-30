package com.example.vinhmvp.view.impl;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import com.example.vinhmvp.CategoryApplication;
import com.example.vinhmvp.injection.AppComponent;
import com.example.vinhmvp.presenter.MainPresenter;

abstract class BaseActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //them
        setupComponent((AppComponent) CategoryApplication.get(this).component());
    }

    protected abstract void setupComponent(@NonNull AppComponent parentComponent);

    @NonNull
    protected abstract PresenterFactory<MainPresenter> getPresenterFactory();
}
