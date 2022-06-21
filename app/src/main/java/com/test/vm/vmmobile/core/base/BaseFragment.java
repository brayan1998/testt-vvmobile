package com.test.vm.vmmobile.core.base;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


import com.test.vm.vmmobile.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;


public abstract class BaseFragment <P extends BasePresenter> extends Fragment implements BaseView {

    public final String TAG = "VMMOBILE";
    protected Context parentContext;
    private P presenter;
    private ProgressDialog loadingDialog;
    private Unbinder unbinder;

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(getLayoutId(), container, false);
        this.unbinder = ButterKnife.bind(this, view);

        this.presenter = createPresenter();

        this.loadingDialog = new ProgressDialog(getActivity(), R.style.Vmobile_Dark_DialogLoading);
        this.loadingDialog.setIndeterminate(true);
        this.loadingDialog.setMessage(getString(R.string.msg_base_cargando));
        this.loadingDialog.setCancelable(false);

        this.presenter.create();


        return view;
    }

    @Override
    public Context getContext() {
        return parentContext;
    }

    @TargetApi(23)
    @Override
    public final void onAttach(Context context) {
        super.onAttach(context);
        onAttachToContext(context);
    }

    @SuppressWarnings("deprecation")
    @Override
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            onAttachToContext(activity);
        }
    }

    /*
     * Called when the fragment attaches to the context
     */
    protected void onAttachToContext(Context context) {
        this.parentContext = context;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

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
    public void onDestroy() {
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
    public void onStart() {
        super.onStart();
        this.presenter.start();

    }

    @Override
    public void onResume() {
        super.onResume();
        this.presenter.resume();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override
    public void onStop() {
        super.onStop();
        this.presenter.stop();
    }

    @Override
    public void showError(String error) {
        if(error == null  || error.isEmpty()) return;
       // DialogFactory.error(this.parentContext, error).show();
    }

    @Override
    public String getMessage(int id) {
        return getString(id);
    }

    @Override
    public void showLoading() {
        if(loadingDialog != null){
            loadingDialog.show();
        }
    }

    @Override
    public void hideLoading() {
        if(loadingDialog != null){
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
    public void closeSession() {
        getActivity().finish();
    }

    @Override
    public Activity getActivityReference() {
        return getActivity();
    }

}
