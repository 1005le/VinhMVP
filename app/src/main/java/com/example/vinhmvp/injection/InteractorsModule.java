package com.example.vinhmvp.injection;

import com.example.vinhmvp.interactor.impl.MainInteractorImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class InteractorsModule {
    @Provides
    public MainInteractorImpl provideFindItemsInteractor() {
        return new MainInteractorImpl();
    }
}
