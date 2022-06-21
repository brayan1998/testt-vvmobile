package com.test.vm.vmmobile.consultas.presenter;

import com.test.vm.vmmobile.consultas.model.remote.IConsultaPaisApi;
import com.test.vm.vmmobile.consultas.model.remote.response.ConsultaPaisAllResponse;
import com.test.vm.vmmobile.consultas.model.remote.response.PaisSearch;
import com.test.vm.vmmobile.consultas.ui.view.ConsultaPaisView;
import com.test.vm.vmmobile.consultas.util.Pais;
import com.test.vm.vmmobile.core.base.BasePresenter;
import com.test.vm.vmmobile.core.retrofit.ApiCallback;
import com.test.vm.vmmobile.core.retrofit.ApiGenerator;

import java.util.ArrayList;
import java.util.List;

public class ConsultaPaisPresenter extends BasePresenter<ConsultaPaisView> {

    private IConsultaPaisApi api;

    public ConsultaPaisPresenter(ConsultaPaisView view) {
        super(view);
        this.api = ApiGenerator.createApi(view, IConsultaPaisApi.class);
    }

    public void init() {
        getView().showLoading();
        api.getAllCountries().enqueue(new ApiCallback<List<Pais>>(getView()) {
            public void onSuccess(List<Pais> response) {
                getView().setListPais(response);
                getView().hideLoading();
            }

        });
    }
    
    public void getNameCountrie() {
        getView().showLoading();
        api.getNameCountrie("colombia").enqueue(new ApiCallback<List<Pais>>(getView()) {
            @Override
            public void onSuccess(List<Pais> response) {
                System.out.println(response);
                getView().hideLoading();
            }

        });

    }
}
