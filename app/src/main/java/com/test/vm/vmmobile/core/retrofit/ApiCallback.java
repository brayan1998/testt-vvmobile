package com.test.vm.vmmobile.core.retrofit;

import android.util.Log;


import com.test.vm.vmmobile.core.base.BaseView;
import com.test.vm.vmmobile.core.exception.ApiException;
import com.test.vm.vmmobile.core.exception.ErrorResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public abstract class ApiCallback<T> implements Callback<T> {

    protected BaseView view;


    public ApiCallback(BaseView view) {
        this.view = view;
    }


    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        if (response != null && response.isSuccessful() && response.errorBody() == null && response.raw().code() == 200) {
            onSuccess(response.body());
        } else if (response.raw().code() == 401) {
            view.closeSession();
        } else {
            //onError(new ApiException(ApiGenerator.parseError(response)));
        }
        onFinish();
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        onError(new ApiException(new ErrorResponse(), t));
        onFinish();
    }

    public abstract void onSuccess(T response);

    public void onError(ApiException t) {
        if (view != null) {
            view.hideLoading();
            String mensaje = t.getError().getMensaje();
            if (t.getError().getMensaje() != null){
                mensaje = t.getError().getMensaje().replace("null", "").replace("<strong>", "");
            }
            Log.i("info",""+mensaje);
            view.showError(mensaje);
        }

    }


    public void onFinish() {

    }

}
