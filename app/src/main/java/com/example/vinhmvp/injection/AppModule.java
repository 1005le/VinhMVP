package com.example.vinhmvp.injection;

import android.app.Application;

import com.example.vinhmvp.CategoryApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private CategoryApplication categoryApplication;

    public AppModule(CategoryApplication categoryApplication) {
        this.categoryApplication = categoryApplication;
    }
    @Provides
    @Singleton
    public Application provideApplication() {
        return categoryApplication;
    }
}
