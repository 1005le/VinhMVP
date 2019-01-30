package com.example.vinhmvp;

import android.app.Application;
import android.content.Context;

import com.example.vinhmvp.injection.AppComponent;
import com.example.vinhmvp.injection.AppModule;

public class CategoryApplication extends Application {

    private AppComponent component;
    public static CategoryApplication get(Context context) {
        return (CategoryApplication) context.getApplicationContext();
    }

    @Override public void onCreate() {
        super.onCreate();
        setupGraph();
    }

    private void setupGraph() {
        //loi khong chay
        component = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        component.inject(this);
    }
    public AppComponent component() {
        return component;
    }

}
