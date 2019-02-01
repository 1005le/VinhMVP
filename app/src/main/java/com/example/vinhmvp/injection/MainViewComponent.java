package com.example.vinhmvp.injection;

import com.example.vinhmvp.presenter.MainPresenter;
import com.example.vinhmvp.view.impl.CategoryActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = MainViewModule.class)
public interface MainViewComponent {

    void inject(CategoryActivity activity);
//Them moi
    MainPresenter getMainPresenter();

}