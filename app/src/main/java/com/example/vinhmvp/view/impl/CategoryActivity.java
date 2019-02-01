package com.example.vinhmvp.view.impl;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.vinhmvp.R;
import com.example.vinhmvp.adapter.CategoryAdapter;
import com.example.vinhmvp.injection.AppComponent;
import com.example.vinhmvp.injection.DaggerMainViewComponent;
import com.example.vinhmvp.injection.MainViewModule;
import com.example.vinhmvp.model.Category;
import com.example.vinhmvp.presenter.MainPresenter;
import com.example.vinhmvp.view.MainView;

import java.util.List;

import javax.inject.Inject;

public class CategoryActivity extends BaseActivity implements MainView, CategoryAdapter.ItemClickListener {

        @Inject MainPresenter mainPresenter;
       private ProgressBar progressBar;
      private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        initViews();
        setUpToolbar();

    }

    @Override
    protected void setupComponent(AppComponent appComponent) {
        DaggerMainViewComponent.builder()
                .appComponent(appComponent)
                .mainViewModule(new MainViewModule(this))
                .build()
                .inject(this);
    }

    @Override protected void onResume() {
        super.onResume();
        mainPresenter.onResume();
    }
    private void setUpToolbar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(false);
            actionBar.setDisplayShowTitleEnabled(true);
        }
    }
    private void initViews() {
        recyclerView = (RecyclerView) findViewById(R.id.rv_categorys);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
    }

    @Override
    public void onItemClick(Category category, int position) {
    }


    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        recyclerView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
        recyclerView.setVisibility(View.VISIBLE);
    }

    @Override
    public void showCategories(List<Category> categories) {
        CategoryAdapter categoryAdapter = new CategoryAdapter();
        categoryAdapter.setCategories(categories);
        categoryAdapter.setItemClickListener(this);
        recyclerView.setAdapter(categoryAdapter);
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
