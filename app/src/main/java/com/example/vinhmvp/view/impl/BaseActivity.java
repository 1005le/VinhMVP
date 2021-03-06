package com.example.vinhmvp.view.impl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.vinhmvp.CategoryApplication;
import com.example.vinhmvp.injection.AppComponent;

public abstract class BaseActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupComponent((AppComponent) CategoryApplication.get(this).component());
    }

    protected abstract void setupComponent(AppComponent appComponent);
}
