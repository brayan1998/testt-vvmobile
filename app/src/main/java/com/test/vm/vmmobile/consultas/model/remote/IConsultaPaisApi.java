package com.test.vm.vmmobile.consultas.model.remote;


import com.test.vm.vmmobile.consultas.model.remote.response.ConsultaPaisAllResponse;
import com.test.vm.vmmobile.consultas.util.Pais;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IConsultaPaisApi {

    @GET("all")
    Call<List<Pais>> getAllCountries();

    @GET("name/{name}")
    Call<List<Pais>> getNameCountrie(@Path("name") String name);
}
