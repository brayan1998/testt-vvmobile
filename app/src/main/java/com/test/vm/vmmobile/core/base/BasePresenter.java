package com.test.vm.vmmobile.core.base;

public abstract class BasePresenter <V extends BaseView> {

    private V view;

    public BasePresenter(V view) {
        this.view = view;
    }

    public V getView() {
        return view;
    }

    public void create(){}

    public void start(){}

    public void resume(){}

    public void pause(){}

    public void stop(){}

    public void destroy(){
        this.view = null;
    }

}
