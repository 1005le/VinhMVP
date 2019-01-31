package com.example.vinhmvp.injection;

import com.example.vinhmvp.CategoryApplication;
import com.example.vinhmvp.interactor.impl.MainInteractorImpl;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = { AppModule.class, InteractorsModule.class})
public interface AppComponent {
    //chuyen class thanh interface

    void inject(CategoryApplication categoryApplication);
     MainInteractorImpl getFindItemsInteractor();

}
