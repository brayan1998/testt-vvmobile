package com.test.vm.vmmobile.consultas.presenter;

import com.test.vm.vmmobile.consultas.model.remote.IConsultaPaisApi;
import com.test.vm.vmmobile.consultas.ui.view.ConsultaPaisView;
import com.test.vm.vmmobile.consultas.util.Pais;
import com.test.vm.vmmobile.core.base.BasePresenter;
import com.test.vm.vmmobile.core.retrofit.ApiCallback;
import com.test.vm.vmmobile.core.retrofit.ApiGenerator;

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
}
