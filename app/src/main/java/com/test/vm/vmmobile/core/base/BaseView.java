package com.test.vm.vmmobile.core.base;

import android.app.Activity;
import android.content.Context;

public interface BaseView {

     Context getContext();


    void showError(String error);


    void showLoading();


    void hideLoading();


    void dismissLoading();

    String getMessage(int id);


    void closeSession();

    Activity getActivityReference();
}
