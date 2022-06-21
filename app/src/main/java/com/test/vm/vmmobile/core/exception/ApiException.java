package com.test.vm.vmmobile.core.exception;

import android.util.Log;

public class ApiException extends RuntimeException{

    private ErrorResponse error;

    public ApiException(ErrorResponse error, Throwable t){
        super(t);
        Log.d("ApiException", t.getMessage());
        this.error = error;
    }

    public ApiException(ErrorResponse error){
        super(error.getMensaje());
        this.error = error;
    }

    public ErrorResponse getError() {
        return error;
    }

    public void setError(ErrorResponse error) {
        this.error = error;
    }
}
