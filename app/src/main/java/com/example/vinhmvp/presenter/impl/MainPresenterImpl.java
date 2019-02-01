package com.example.vinhmvp.presenter.impl;

import com.example.vinhmvp.interactor.MainInteractor;
import com.example.vinhmvp.interactor.impl.MainInteractorImpl;
import com.example.vinhmvp.model.Category;
import com.example.vinhmvp.presenter.MainPresenter;
import com.example.vinhmvp.view.MainView;

import java.util.List;

public class MainPresenterImpl extends BasePresenterImpl<MainView> implements MainPresenter,MainInteractor  {
    /**
     * The interactor
     */
   // @NonNull
   // private final MainInteractor mInteractor; //moi xoaaaa
    // The view is available using the mView variable

//    @Inject
//    public MainPresenterImpl(@NonNull MainInteractor interactor) {
//        mInteractor = interactor;
//    }
    @Override
    public void onStart(boolean viewCreated) {
        super.onStart(viewCreated);

        // Your code here. Your view is available using mView and will not be null until next onStop()
    }
    @Override
    public void onStop() {
        // Your code here, mView will be null after this method until next onStart()

        super.onStop();
    }
    @Override
    public void onPresenterDestroyed() {
        /*
         * Your code here. After this method, your presenter (and view) will be completely destroyed
         * so make sure to cancel any HTTP call or database connection
         */

        super.onPresenterDestroyed();
    }


    //them , categories = MainInteracterImpl, call back = MainInteracter
    private MainView view;
    private MainInteractorImpl mainInteractorImpl;

    public MainPresenterImpl( MainView view,MainInteractorImpl mainInteractorImpl) {
        this.view = view;
        this.mainInteractorImpl = mainInteractorImpl;
    }
    @Override
    public void onResume() {
        view.showProgress();
        mainInteractorImpl.getCategories(this);
    }

    @Override
    public void onItemSelected(Category category, int position) {
        view.showMessage(String.format(category.getName() + " ->" + " Position %d clicked", position));
    }

    @Override
    public void onLoadCategories(List<Category> categories) {
        view.showCategories(categories);
        view.hideProgress();
    }

}