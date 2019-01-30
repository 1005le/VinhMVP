package com.example.vinhmvp.injection;

import com.example.vinhmvp.interactor.impl.MainInteractorImpl;
import com.example.vinhmvp.presenter.MainPresenter;
import com.example.vinhmvp.presenter.impl.MainPresenterImpl;
import com.example.vinhmvp.view.MainView;

import dagger.Module;
import dagger.Provides;

@Module
public final class MainViewModule {

//    @Provides
//    public MainInteractor provideInteractor() {
//        return new MainInteractorImpl();
//    }
//
//    @Provides
//    public PresenterFactory<MainPresenter> providePresenterFactory(@NonNull final MainInteractor interactor) {
//        return new PresenterFactory<MainPresenter>() {
//            @NonNull
//            @Override
//            public MainPresenter create() {
//                return new MainPresenterImpl(interactor);
//            }
//        };
//    }


    //Them
    private MainView view;

    public MainViewModule(MainView view) {
        this.view = view;
    }

    @Provides
    public MainView provideView() {
        return view;
    }

    @Provides
    public MainPresenter providePresenter(MainView categoryView, MainInteractorImpl mainInteractorImpl) {
        return new MainPresenterImpl(categoryView, mainInteractorImpl);
    }
}
