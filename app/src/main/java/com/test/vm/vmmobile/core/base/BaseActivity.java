package com.test.vm.vmmobile.core.base;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;


import com.test.vm.vmmobile.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;



public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements BaseView {

    public final String TAG = "VMMOBILE";

    private P presenter;
    private ProgressDialog loadingDialog;
    private Unbinder unbinder;

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        this.unbinder = ButterKnife.bind(this);
        this.presenter = createPresenter();
        this.presenter.create();
        this.loadingDialog = new ProgressDialog(this, R.style.Theme_VMMobile);
        this.loadingDialog.setIndeterminate(true);
        this.loadingDialog.setMessage(getString(R.string.msg_base_cargando));
        this.loadingDialog.setCancelable(false);


    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public String getMessage(int id) {
        return getString(id);
    }


    @Override
    protected void onStart() {
        super.onStart();
        this.presenter.start();

    }

    @Override
    protected void onResume() {
        super.onResume();
        this.presenter.resume();

    }

    @Override
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.presenter.stop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if( this.loadingDialog != null){
            this.loadingDialog.dismiss();
            this.loadingDialog = null;
        }


        if( this.presenter != null) {
            this.presenter.destroy();
            this.presenter= null;
        }

        if( this.unbinder != null) {
            this.unbinder.unbind();
            this.unbinder = null;
        }
    }

    @Override
    public void closeSession() {
        finish();
    }

    @Override
    public void showError(String error) {
        //DialogFactory.error(this, error).show();
    }

    @Override
    public void showLoading() {
        loadingDialog.show();
    }

    @Override
    public void hideLoading() {
        if (loadingDialog != null){
            loadingDialog.hide();
        }
    }

    @Override
    public void dismissLoading() {
        if (loadingDialog != null){
            loadingDialog.dismiss();
        }
    }

    public P getPresenter() {
        return this.presenter;
    }

    public abstract P createPresenter();
    public abstract int getLayoutId();



    @Override
    public Activity getActivityReference() {
        return getParent();
    }


}