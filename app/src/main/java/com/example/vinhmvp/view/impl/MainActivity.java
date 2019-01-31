//package com.example.vinhmvp.view.impl;
//
//public final class MainActivity extends BaseActivity implements MainView , CategoryAdapter.ItemClickListener {
//
//    @Inject
//    PresenterFactory<MainPresenter> mPresenterFactory;
////
////    @Inject MainPresenter mainPresenter;
////    private ProgressBar progressBar;
////    private RecyclerView recyclerView;
////
////    // Your presenter is available using the mPresenter variable
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_main);
//////them
////        initViews();
////        setUpToolbar();

//    }
//    @Override protected void onResume() {
////        super.onResume();
////        mainPresenter.onResume();
////    }
////    private void setUpToolbar() {
////        ActionBar actionBar = getSupportActionBar();
////        if (actionBar != null) {
////            actionBar.setDisplayHomeAsUpEnabled(false);
////            actionBar.setDisplayShowTitleEnabled(true);
////        }
////    }
////
////    private void initViews() {
////        recyclerView = (RecyclerView) findViewById(R.id.rv_categorys);
////        progressBar = (ProgressBar) findViewById(R.id.progress);
////        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
////        setSupportActionBar(mToolbar);
////    }
//////    private void setContentView(int activity_main) {
//////    }
//////
////
////
////    @Override
////    protected void setupComponent(@NonNull AppComponent parentComponent) {
//////        DaggerMainViewComponent.builder()
//////                .appComponent(parentComponent)
//////                .mainViewModule(new MainViewModule(this))
//////                .build()
//////                .inject(this);
////    }
////    @NonNull
////    @Override
////    protected PresenterFactory<MainPresenter> getPresenterFactory() {
////        return mPresenterFactory;
////    }
////
//////them vao
////    @Override
////    public void onItemClick(Category category, int position) {
////
////    }
////
////    @Override
////    public void showProgress() {
////        progressBar.setVisibility(View.VISIBLE);
////        recyclerView.setVisibility(View.INVISIBLE);
////    }
////
////    @Override
////    public void hideProgress() {
////        progressBar.setVisibility(View.INVISIBLE);
////        recyclerView.setVisibility(View.VISIBLE);
////    }
////
////    @Override
////    public void showCategories(List<Category> categories) {
////        CategoryAdapter categoryAdapter = new CategoryAdapter();
////        categoryAdapter.setCategories(categories);
////        categoryAdapter.setItemClickListener(this);
////        recyclerView.setAdapter(categoryAdapter);
////    }
////
////    @Override
////    public void showMessage(String message) {
////        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
////    }
////}
